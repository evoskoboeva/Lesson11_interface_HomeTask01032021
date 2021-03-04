package Task4_5;

import java.util.Arrays;
import java.util.Scanner;

import static Task4_5.Color.*;
import static Task4_5.Size.*;

public class Main {
    public static void main(String[] args) {
        //a) Создать перечисление, содержащее размеры одежды (XXS, XS, S, M, L, XL, XXL, XXXL).
        // Перечисление содержит метод getDescription, возвращающий строку "Взрослый размер".
        // Переопределить метод getDescription - для константы XXS метод должен возвращать строку “Детский размер”.
        // Также перечисление должно содержать числовое значение euroSize(32, 34, 36, 38, 40, 42, 44, 46),
        // соответствующее каждому размеру. Создать конструктор, принимающий на вход euroSize.
        //б) Создать интерфейсы "Мужская Одежда" с методом "одетьМужчину" и "Женская Одежда" с методом "одетьЖенщину".
        //в) Создать абстрактный класс Одежда, содержащий переменные - размер одежды, стоимость, цвет.
        //г) Создать классы наследники Одежды - Футболка (реализует интерфейсы "Мужская Одежда" и "Женская Одежда"),
        // Штаны (реализует интерфейсы "Мужская Одежда" и "Женская Одежда"), Юбка (реализует интерфейсы "Женская Одежда"),
        // Галстук (реализует интерфейсы "Мужская Одежда").
        //д) Создать массив, содержащий все типы одежды. Создать класс Ателье, содержащий методы одетьЖенщину,
        // одетьМужчину, на вход которых будет поступать массив, содержащий все типы одежды. Метод одетьЖенщину
        // выводит на консоль всю информацию о женской одежде. То же самое для метода одетьМужчину.
        Scanner scanner = new Scanner(System.in);

        Tshirt tshirt01 = new Tshirt(S, 100, WHITE);
        Tshirt tshirt02 = new Tshirt(M, 200, BLACK);
        Tshirt tshirt03 = new Tshirt(XXL, 300, GREEN);
        Skirt skirt01 = new Skirt(XXS, 400, BLUE);
        Skirt skirt02 = new Skirt(L, 500, WHITE);
        Pants pants01 = new Pants(XXXL, 450, RED);
        Tie tie01 = new Tie(XS, 300, GREEN);
        Tie tie02 = new Tie(L, 450, BROWN);

        int count = 8;

        Atelier atelier = new Atelier(count);
        atelier.clothes[0] = tshirt01;
        atelier.clothes[1] = tshirt02;
        atelier.clothes[2] = tshirt03;
        atelier.clothes[3] = skirt01;
        atelier.clothes[4] = skirt02;
        atelier.clothes[5] = pants01;
        atelier.clothes[6] = tie01;
        atelier.clothes[7] = tie02;


        //Создаем мини приложение - интернет-магазин.  Должны быть реализованы следующие возможности:
        //а) аутентификация пользователя (пользователь вводит логин и пароль с клавиатуры),
        //б) просмотр списка каталогов товаров,
        //в) просмотр списка всех товаров определенного каталога,
        //г) выбор товара в корзину,
        //д) покупка товаров, находящихся в корзине.
        //Создаем перечисление содержащее значения для перечисленных операций.
        // Можете добавить свои операции или изменить что-то на свой вкус.

        int menu=1;
        while (menu==1) {
            System.out.println(Arrays.toString(iShopNew.values()));
            //System.out.println(Arrays.toString(iShop.));


            iShopNew enter;
            System.out.println("select menu item using '_'");
            enter = iShopNew.valueOf(scanner.next());
            switch (enter) {
                case _1: {      //LogIn

                    System.out.println("Enter login");
                    String login = scanner.next();
                    System.out.println("Enter password");

                    String password = scanner.next();
                    System.out.println(iUser.tryLogin(login, password));
                    break;

                }
                case _6: {                      //BUY  - подбор товаров в корзину методом перебора и определение общей стоимости отбранного
                    System.out.println(atelier.Buy());
                    break;
                }
                case _2: {                          //CATEGORIES
                    System.out.println(Arrays.toString(Catalog.values()));
                    System.out.println(" show products by category? 1 - yes");
                    int show = scanner.nextInt();
                    if (show == 1) {
                        System.out.println("Will be available in next version)))");
                    }

                    break;

                }
                case _3: {                          //CATALOG
                    System.out.println(atelier);
                    break;

                }
                case _5: {                          //ForHer
                    System.out.println(atelier.DressWomen());
                    break;
                }
                case _4: {                          //ForHim
                    System.out.println(atelier.DressMan());
                    break;

                }
                case _7: {                  //others
                    System.out.println(atelier);
                    Size.getDescription();
                    Size.getDescription(XXS);
                    break;

                }
            }
            System.out.println("GO TO Main menu? 1 - yes");
            menu = scanner.nextInt();
        }
    }
}





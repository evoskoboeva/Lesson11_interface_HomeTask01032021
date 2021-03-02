package Task3;

import static Task3.SeasonsOfYear.*;

public class Main {
    public static void main(String[] args) {
    //а) Создать перечисление, содержащее названия времен года.
        //б) Создать переменную содержащую ваше любимое время года и распечатать всю информацию о нем.
        //в) Создать метод, который принимает на вход переменную созданного вами enum типа. Если значение равно Лето,
        // выводим на консоль “Я люблю лето” и так далее. Используем оператор switch.
        //г) Перечисление должно содержать переменную, содержащую среднюю температуру в каждом времени года.
        //д) Добавить конструктор принимающий на вход среднюю температуру.
        //е) Создать метод getDescription, возвращающий строку “Холодное время года”.
        // Переопределить метод getDescription - для константы Лето метод должен возвращать “Теплое время года”.
        //ж) В цикле распечатать все времена года, среднюю температуру и описание времени года.

       /*
        System.out.println(SeasonsOfYear.valueOf("SUMMER"));
        //AboutLikeSeason("SPRING");

        System.out.println(java.util.Arrays.asList(SeasonsOfYear.values()));
        System.out.println(SeasonsOfYear.AUTUMN.getAverageTemp());
*/
       /* for (SeasonsOfYear dir: SeasonsOfYear.values()) {
            System.out.println(dir.name());
            System.out.println(dir.getAverageTemp());

        }
        System.out.println(SeasonsOfYear.AUTUMN.getAverageTemp());
        System.out.println(SeasonsOfYear.SUMMER);
        System.out.println(SeasonsOfYear.AUTUMN);
        System.out.println(SeasonsOfYear.WINTER);
        System.out.println(SeasonsOfYear.SPRING);*/

        /*SeasonsOfYear like = SUMMER;
        System.out.println(SeasonsOfYear.valueOf(like.name()).AboutLikeSeason(like));*/

        for (SeasonsOfYear dir: SeasonsOfYear.values()) {
            System.out.println(dir.name());
            System.out.println(dir.getAverageTemp());
            SeasonsOfYear like = SeasonsOfYear.valueOf(dir.name());
            System.out.println(SeasonsOfYear.valueOf(like.name()).AboutLikeSeason(like));


        }
        }
    }

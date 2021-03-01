package Task1;

public class Main {

    public static void main(String[] args) {
	//а) Определить интерфейс IPrintable, содержащий метод void print().
        //б) Определить класс Book, реализующий интерфейс IPrintable.
        //в) Определить класс Magazine, реализующий интерфейс IPrintable.
        //г) Создать массив типа IPrintable, который будет содержать книги и журналы.
        //д) В цикле пройти по массиву и вызвать метод print() для каждого объекта.
        //е) Создать статический метод printMagazines(IPrintable[] printable) в классе Magazine,
        // который выводит на консоль названия только журналов.  Создать статический метод
        // printBooks(Printable[] printable) в классе Book,
        // который выводит на консоль названия только книг. Используем оператор instanceof.

        Magazine magazine = new Magazine("123");
        Magazine magazine1 = new Magazine("456");
        Book book = new Book("qwerty");
        Book book1 = new Book("asdfg");

        Printable printable = new Printable(4);
        printable.printables[0] = magazine;
        printable.printables[1]=book;
        printable.printables[2]=magazine1;
        printable.printables[3]=book1;
        System.out.println(printable);

        System.out.println(Magazine.printMagazines(printable.printables));

        System.out.println(Book.printBooks(printable.printables));



    }
}

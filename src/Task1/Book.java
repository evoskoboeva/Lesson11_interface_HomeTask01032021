package Task1;

import java.util.Arrays;
import java.util.Objects;

public class Book implements IPrintable{
    private String name;

    @Override
    public String toString() {
        return "Book(" +
                "name='" + getName() + '\'' +
                ')';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getName().equals(book.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Printing book"+this.name);


    }
    public static String printBooks(IPrintable[] printable) {
        String result= "";
        for (int i = 0; i < printable.length; i++) {
            if (printable[i] instanceof Book) {
               result += printable[i];
            }

        }

        return result;
    }
}

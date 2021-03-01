package Task1;

import java.util.Arrays;
import java.util.Objects;

public class Magazine implements IPrintable {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Magazine)) return false;
        Magazine magazine = (Magazine) o;
        return getName().equals(magazine.getName());
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

    @Override
    public String toString() {
        return "Magazine(" +
                "name='" + getName() + '\'' +
                ')';
    }

    public Magazine(String name) {
        this.setName(name);

    }

    private String name;

    @Override
    public void print() {
        System.out.println("Printing magazine" + this.name);

    }

    public static String printMagazines(IPrintable[] printable) {

            String result = "";
            for (int i = 0; i < printable.length; i++) {
                if (printable[i] instanceof Magazine) {
                    result += printable[i];
                }
            }
            return result;
        }
}
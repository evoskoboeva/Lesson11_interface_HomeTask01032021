package Task1;

import java.util.Arrays;

public class Printable implements IPrintable{

    IPrintable[] printables;

    public Printable(int count) {
    printables = new IPrintable[count];
    }

    @Override
    public String toString() {

        return "Printable" + Arrays.toString(printables);

    }


    @Override
    public void print() {

    }
}

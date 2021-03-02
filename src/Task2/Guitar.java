package Task2;

import java.util.Objects;

public class Guitar implements iInstrument{
    private int numberOfStrings;

    @Override
    public String toString() {
        return "Guitar " +
                "numberOfStrings= " + (this.numberOfStrings<0? "incorrect numbers of strings": this.numberOfStrings);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Guitar)) return false;
        Guitar guitar = (Guitar) o;
        return getNumberOfStrings() == guitar.getNumberOfStrings();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumberOfStrings());
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        if (numberOfStrings < 1 || numberOfStrings>12){
            this.numberOfStrings = -1;
        }
        else {
            this.numberOfStrings = numberOfStrings;
        }
    }


    public Guitar(int numberOfStrings) {
        this.setNumberOfStrings (numberOfStrings);
    }

    @Override
    public void Play() {
        System.out.println("Play guitar "+KEY);


    }
}

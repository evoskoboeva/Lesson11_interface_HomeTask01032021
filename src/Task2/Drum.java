package Task2;

import java.util.Objects;

public class Drum implements iInstrument{
    private int size;


    @Override
    public void Play() {
        System.out.println("Play drum "+KEY);


    }

    @Override
    public String toString() {
        return "Drum " +
                "size= " + (this.size<0? "incorrect size": this.size );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Drum)) return false;
        Drum drum = (Drum) o;
        return getSize() == drum.getSize();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSize());
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {

            this.size = size;
        }


    public Drum(int size) {
        this.setSize(size);
    }
}

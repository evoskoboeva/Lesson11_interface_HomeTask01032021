package Task2;

import java.util.Objects;

public class Trumpet implements iInstrument{
    private int diametr;

    @Override
    public String toString() {
        return "Trumpet " +
                "diametr= " + (this.diametr<0? "incorrect diametr": this.diametr) ;
    }

    public int getDiametr() {
        return diametr;
    }

    public void setDiametr(int diametr) {
        this.setDiametr(diametr);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trumpet)) return false;
        Trumpet trumpet = (Trumpet) o;
        return getDiametr() == trumpet.getDiametr();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDiametr());
    }

    public Trumpet(int diametr) {
        this.diametr = diametr;
    }

    @Override
    public void Play() {
        System.out.println("Play trumplet "+KEY);

    }
}

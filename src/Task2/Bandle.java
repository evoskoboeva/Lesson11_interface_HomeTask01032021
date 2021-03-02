package Task2;

import java.util.Arrays;

public class Bandle implements iInstrument {
    iInstrument[] bandles;

    public Bandle(int count) {
        bandles = new iInstrument[count];

    }

    @Override
    public String toString() {
        return "Bandle{" +
                "instrument=" + Arrays.toString(bandles) +
                '}';
    }

    @Override
    public  void Play() {

    }
}

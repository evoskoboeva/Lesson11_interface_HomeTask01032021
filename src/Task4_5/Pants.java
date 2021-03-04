package Task4_5;

public class Pants extends Clothes implements iWomensClothing, iMensClothing {
    @Override
    public String toString() {
        return "Pants(" +
                "size=" + size + "("+ getSize().name()+")"+
                ", price=" + price +
                ", color='" + color + '\'' +

                ')';
    }

    public Pants(Size size, double price, Color color) {
        super(size, price, color);
    }

    @Override
    public String DressMan() {
        return null;
    }

    @Override
    public String DressWomen() {
        return null;
    }
}

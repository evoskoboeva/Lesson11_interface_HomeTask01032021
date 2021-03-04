package Task4_5;

public class Skirt extends Clothes implements iWomensClothing {
    @Override
    public String toString() {
        return "Skirt(" +
                "size=" + size + "("+ getSize().name()+")"+
                ", price=" + price +
                ", color=" + color +
                ')';
    }

    public Skirt(Size size, double price, Color color) {
        super(size, price, color);
    }

    @Override
    public String DressWomen() {
        return null;
    }
}

package Task4_5;

public class Tie extends Clothes implements iMensClothing {
    @Override
    public String toString() {
        return "Tie(" +
                "size=" + size + "("+ getSize().name()+")"+
                ", price=" + price +
                ", color=" + color +
                ')';
    }

    public Tie(Size size, double price, Color color) {
        super(size, price, color);
    }

    @Override
    public String DressMan() {
        return null;
    }
}

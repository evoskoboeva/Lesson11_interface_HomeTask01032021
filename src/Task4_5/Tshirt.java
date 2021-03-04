package Task4_5;

public class Tshirt extends Clothes implements iMensClothing, iWomensClothing {

    public Tshirt(Size size, double price, Color color) {
        super(size, price, color);
    }

    @Override
    public String toString() {
        return "Tshirt(" +
                "size=" + size + "("+ getSize().name()+")"+
                ", price=" + price +
                ", color='" + color + '\'' +
                ')';
    }

    @Override
    public String DressMan() {
        return  null;

    }

    @Override
    public String DressWomen() {
        return null;
    }
}


package Task4_5;

public enum Size {

    XXS(32),
    XS(34),
    S(36),
    M(38),
    L(40),
    XL(42),
    XXL(44),
    XXXL(48);


    private int euroSize;

    public int getEuroSize() {
        return euroSize;
    }

    @Override
    public String toString() {
        return "" +euroSize;

    }

    public void setEuroSize(int euroSize) {
        this.euroSize = euroSize;
    }

    Size(int euroSize) {
        this.euroSize = euroSize;
    }
    public static void getDescription(){
        System.out.println("Adult size");
    }

    public static void getDescription(Size XXS){
        System.out.println("Child size");
    }
}

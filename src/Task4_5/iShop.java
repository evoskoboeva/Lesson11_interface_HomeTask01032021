package Task4_5;

public enum iShop {
    LogIn(1),
    CATEGORIES(2),
    CATALOG(3),
    ForHim(4),
    ForHer(5),
    BUY(6),
    Task4_others(7);

    @Override
    public String toString() {
        return "iShop{" +
                "number=" + number +
                '}';
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public  int number;

    iShop(int number) {
        this.number = number;
    }
}

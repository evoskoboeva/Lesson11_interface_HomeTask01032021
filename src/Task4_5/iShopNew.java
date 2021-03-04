package Task4_5;

public enum iShopNew {
 _1 ("LogIn"),
 _2 ("CATEGORIES"),
 _3 ("CATALOG"),
 _4 ("ForHim"),
_5 ("ForHer"),
_6 ("BUY"),
_7 ("Task4_others");

    @Override
    public String toString() {
        return    this.cat + " ->"+this.name();
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    String cat;

    iShopNew(String cat) {
        this.cat = cat;
    }
}
/*
1(LogIn),
        2 (CATEGORIES),
        3 (CATALOG),
        4 (ForHim),
        5 (ForHer),
        6 (BUY),
        7 (Task4_others);*/

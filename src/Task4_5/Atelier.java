package Task4_5;

import java.util.Scanner;

public class Atelier implements iWomensClothing, iMensClothing {
Scanner scanner = new Scanner(System.in);
int want;
double resultCost;
    public String Buy(){
        String result = "\nBUY \n\n";
        System.out.println(result);
        System.out.println(clothes[0]);

        for (int i = 1; i < this.clothes.length; i++) {
            System.out.println("Buy it? 1-yes,0-no");
                    want = scanner.nextInt();
            if (want == 1){
                result += "\n" + clothes[i];
                resultCost +=clothes[i].price;
                }
            System.out.println(clothes[i]);
        }
        return "you select to"+result+System.lineSeparator()+"Total price = "+resultCost;


    }



    @Override
    public String DressMan() {
        String result = "\nMEN \n\n";
        for (int i = 0; i < this.clothes.length; i++) {
            if (clothes[i] instanceof iMensClothing){
                result += "\n" + clothes[i];}

        }
        return result;

    }

    @Override
    public String DressWomen() {
        String result = "\nWOMEN \n\n";
        for (int i = 0; i < this.clothes.length; i++) {
            if (clothes[i] instanceof iWomensClothing){
            result += "\n" + clothes[i];}

        }
        return result;

    }

    Clothes[] clothes;

    public Atelier(int count) {
        clothes = new Clothes[count];
    }

    @Override
    public String toString() {
        /*return "Atelier(" +
                "clothes=" + Arrays.toString(clothes) +
                                ')';*/
        String result = "\nCatalog\n\n";
        for (int i = 0; i < this.clothes.length; i++) {
            result += "\n" + clothes[i];
        }

        return result;
    }

   /* @Override
    public String DressMan() {
        return null;
    }

    @Override
    public String DressWomen() {
        return null;
    }*/
}

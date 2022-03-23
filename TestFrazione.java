public class TestFrazione {
    public static void main(String[] args) {
        // inizializzo le mie variabili (le prendo dai parametri)

        Frazione f1 = new Frazione(15, 0);
        System.out.println(f1);

        System.out.println(Frazione.denCom(12,2));

        System.out.println(Frazione.asFraction(12, 2));

        // stampo il risultato:
        //sysout(frazSempl, numSempl, denSempl);
    }
}

class Frazione {
    private long numeratore;
    private long denominatore;

    /*
    // oppure:
    Frazione pippo = new Frazione(numeratore, denominatore);

    //----
    Frazione.asFraction(num, den);

    */

    public Frazione(int numeratore, int denominatore) {
        long gcd = denCom(numeratore, denominatore);
        this.numeratore = numeratore / gcd;
        this.denominatore = denominatore / gcd;
    }

        /*public void sysout(String frazSempl, int numSempl, int denSempl) {
            System.out.println("La frazione è: " + numeratore + "/" + denominatore + ".");
            System.out.println("La frazione semplificata ha come numeratore: " + numSempl + ". Il denominatore è: " + denSempl + ".");
            System.out.println("La frazione semplificata risulta essere: " + frazSempl);
        }*/

    public static long denCom(long num, long den) {
        return den == 0 ? num : denCom(den, num % den);
    }

    public static String asFraction(long num, long den) {
        long gcd = denCom(num, den);
        return (num / gcd) + "/" + (den / gcd);
    }

    @Override
    public String toString() {
        return numeratore + "/" + denominatore;
    }
}

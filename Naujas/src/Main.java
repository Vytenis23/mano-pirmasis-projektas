import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    static String a = "A";
    static String b = "AB";
    static String c = "ABC";
    static String d = "ABCD";
    static String e = "ABCDE";

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public String getC() {
        return c;
    }

    public String getD() {
        return d;
    }

    public String getE() {
        return e;
    }

    public static void main(String[] args) {
        HashMap<String, AutomobilioInformacija> kolekcija1 = new HashMap<>();

        ArrayList<String> kolekcija = new ArrayList<>();
        kolekcija.add(a);
        kolekcija.add(b);
        kolekcija.add(c);
        kolekcija.add(d);
        kolekcija.add(e);
        System.out.println(kolekcija.size());
kolekcija.remove(0);
kolekcija.set(0,"Labas");
        System.out.println(kolekcija.indexOf(d));
        System.out.println(kolekcija.get(0));
    }


}
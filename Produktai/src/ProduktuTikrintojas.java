
public class ProduktuTikrintojas {
    static void patikrinti(AbstraktusProduktas produktas) {
        if (produktas.arGalimaVartoti()) {
            System.out.println("Galima vartoti");

        } else System.out.println("Nevartoti");
    }

    static void kalorijuInformacija(KalorijuSkaicius produktas) {
        System.out.println(produktas.kalorijos());

    }
}

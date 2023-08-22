public class ProduktuMain {
    public static void main(String[] args) {
        Produktas pieno1 = new Pienas();
        AbstraktusProduktas sviestas1 = new Sviestas();
        AbstraktusProduktas duona1 = new Duona();
        AbstraktusProduktas jogurtas1 = new Jogurtas();
        AbstraktusProduktas suris1 = new Suris();
        ProduktuTikrintojas.patikrinti((AbstraktusProduktas) pieno1);
        ProduktuTikrintojas.patikrinti(sviestas1);
        ProduktuTikrintojas.patikrinti(duona1);
        ProduktuTikrintojas.patikrinti(jogurtas1);
        ProduktuTikrintojas.kalorijuInformacija((AbstraktusProduktas)pieno1);
        ProduktuTikrintojas.kalorijuInformacija(sviestas1);
        ProduktuTikrintojas.kalorijuInformacija(duona1);
        ProduktuTikrintojas.kalorijuInformacija(jogurtas1);
    }
}

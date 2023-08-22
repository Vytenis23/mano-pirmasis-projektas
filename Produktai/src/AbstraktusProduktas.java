

public abstract class AbstraktusProduktas implements Produktas, KalorijuSkaicius {
    int rand;

    AbstraktusProduktas() {
        rand = (int) (Math.random() * 5 + 1);
    }



    @Override
    public int kalorijos() {
        return rand * 100;
    }

}



public class Jogurtas extends AbstraktusProduktas {

    @Override
    public boolean arGalimaVartoti() {
        if (rand == 1 || rand == 2) {
            return true;
        }
        return false;

    }

}

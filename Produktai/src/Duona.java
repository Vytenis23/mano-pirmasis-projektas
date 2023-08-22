

public class Duona extends AbstraktusProduktas {


    @Override
    public boolean arGalimaVartoti() {
        if (rand == 1 || rand == 2 || rand == 3) {
            return true;
        }
        return false;
    }


}

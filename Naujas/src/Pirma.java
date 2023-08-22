public class Pirma {

    static boolean prideti(String tekstas, String[] masyvas) {
        if (tekstas == null || tekstas.equals("")) {
            return false;
        }

        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] == null) {
                masyvas[i] = tekstas;
                return true;
            }

        }
        return false;

    }

}



public class Pojeb {

    private int wiek;
    private String zboczenie;

    public Pojeb(int aWiek, String aZboczenie) {
        wiek = aWiek;
        zboczenie = aZboczenie;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getZboczenie() {
        return zboczenie;
    }

    public void setZboczenie(String zboczenie) {
        this.zboczenie = zboczenie;
    }

    @Override
    public String toString() {
        return "Jestem zjebany bo : " + Integer.toString(wiek) + " " + zboczenie;
    }
}

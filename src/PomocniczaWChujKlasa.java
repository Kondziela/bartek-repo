public class PomocniczaWChujKlasa {

    private String siema;

    public PomocniczaWChujKlasa(String jakkolwiek) {
        siema = jakkolwiek;
    }

    public PomocniczaWChujKlasa() {
        siema = "Siema";
    }

    public String dajSiema() {
        return siema;
    }

    public void wypisz(int zakres) {
        for (int liczba = 1; liczba < zakres; liczba++) {
            int resztaZ3 = liczba % 3;
            int resztaZ5 = liczba % 5;

            if (resztaZ3 == 0) {
                System.out.print("gowno");
            }
            if (resztaZ5 == 0) {
                System.out.print("privet");
            }
            if (!(resztaZ3 == 0 || resztaZ5 == 0)) {
                System.out.print(liczba);
            }
            System.out.println();
        }
    }

}

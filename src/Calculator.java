import javax.swing.*;

public class Calculator {
    static int ileJest = 10;

    public static void main(String[] args) {
        boolean jestLiczba;
        int pierwszaLiczbaInt = 0;
        do {
            String pierwszaLiczbaString = (JOptionPane.showInputDialog("Wprowadz pierwsza wartosc"));
            jestLiczba = czyToliczba(pierwszaLiczbaString);
            if (jestLiczba) {
                pierwszaLiczbaInt = Integer.parseInt(pierwszaLiczbaString);

            } else {
                System.out.println("Ty debilu, wpisz liczbe");

            }
        }
        while (!jestLiczba);
        System.out.println(pierwszaLiczbaInt);
        // tu wprowadzamy druga liczbe kurwa
        boolean jestLiczba2;
        int drugaLiczbaInt = 0;
        do {
            String pierwszaLiczbaString = (JOptionPane.showInputDialog("Wprowadz druga wartosc"));
            jestLiczba2 = czyToliczba(pierwszaLiczbaString);
            if (jestLiczba2) {
                drugaLiczbaInt = Integer.parseInt(pierwszaLiczbaString);

            } else {
                System.out.println("Ty debilu, wpisz liczbe");

            }
        }
        while (!jestLiczba2);
//        System.out.println(drugaLiczbaInt);
//        System.out.println("Wynik mnozenia " + pierwszaLiczbaInt*drugaLiczbaInt);
//        System.out.println("Wynik dzielenia " + 1.0*pierwszaLiczbaInt/drugaLiczbaInt);
//        System.out.println("Wynik dodawania " + (pierwszaLiczbaInt+drugaLiczbaInt));
//        System.out.println("Wynik odejmownaia " + (pierwszaLiczbaInt-drugaLiczbaInt));
//        System.out.println("Reszta z dzielenia " + (pierwszaLiczbaInt%drugaLiczbaInt));
        do {
            String znak = JOptionPane.showInputDialog("Wprowadz znak");
            switch (znak.charAt(0)) {
                case '+':
                    System.out.println("Wynik dodawania " + (pierwszaLiczbaInt + drugaLiczbaInt));
                    System.exit(0);
                case '-':
                    System.out.println("Wynik odejmownaia " + (pierwszaLiczbaInt - drugaLiczbaInt));
                    System.exit(0);
                case '*':
                    System.out.println("Wynik mnozenia " + pierwszaLiczbaInt * drugaLiczbaInt);
                    System.exit(0);
                case '/':
                    System.out.println("Wynik dzielenia " + 1.0 * pierwszaLiczbaInt / drugaLiczbaInt);
                    System.exit(0);
                default:
                    System.out.println("Ty debilu ");
            }
        } while (true);
    }

    private static boolean czyToliczba(String liczba) {
        char[] znaki = liczba.toCharArray();
        boolean jestLiczba = true;

        for (int i = 0; i<znaki.length; i++) {
            char znak = znaki[i];
            if (znak < '0' || znak > '9') {
                jestLiczba = false;
            }
        }
        return jestLiczba;
    }
}

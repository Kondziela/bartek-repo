package samochody.boundary;

import samochody.control.SamochodControl;

import java.util.Scanner;

public class SamochodMain {

    public static void main(String[] args) {
        SamochodControl samochodControl = new SamochodControl();
        SamochodMain samochodMain = new SamochodMain();
        String gearbox = samochodMain.readValue();



    }

    private String readValue() {
        Scanner ss = new Scanner(System.in);
        return ss.nextLine();
    }

}

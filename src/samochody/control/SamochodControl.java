package samochody.control;

import samochody.data.CarType;
import samochody.data.Samochod;

import java.util.ArrayList;
import java.util.List;

public class SamochodControl {

    private List<Samochod> samochodList = new ArrayList<Samochod>();

    public boolean addCar(String motor, String gearbox, int numberOfSeats, CarType carType) {
        Samochod samochod = new Samochod(motor, gearbox, numberOfSeats, carType);
        if (carExist(samochod)) {
            return false;
        } else {
            samochodList.add(samochod);
            return true;
        }
    }

    private boolean carExist(Samochod samochod) {
        return samochodList.contains(samochod);
    }

    public List<Samochod> getSamochodList() {
        return samochodList;
    }
}

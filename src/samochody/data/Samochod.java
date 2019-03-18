package samochody.data;

public class Samochod {

    private String motor;
    private String gearbox;
    private int numberOfSeats;
    private CarType carType;

    public Samochod() {
    }

    public Samochod(String motor, String gearbox, int numberOfSeats, CarType carType) {
        this.motor = motor;
        this.gearbox = gearbox;
        this.numberOfSeats = numberOfSeats;
        this.carType = carType;
    }

    public Samochod(String motor, String gearbox, CarType carType) {
        this.motor = motor;
        this.gearbox = gearbox;
        this.carType = carType;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getGearbox() {
        return gearbox;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }
}

package zal.devices;

public class LPG extends Car{

    public LPG(String model, String producer, Double mileage, double value, int yearOfProduction){
        super(model, producer, mileage, value, yearOfProduction);
    }

    @Override
    public void refuel() {
        fuel = 100;
    }
}

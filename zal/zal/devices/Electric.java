package zal.devices;

public class Electric extends Car{

    public Electric(String model, String producer, Double mileage, double value, int yearOfProduction){
        super(model, producer, mileage, value, yearOfProduction);
    }

    @Override
    public void refuel() {
        fuel = 100;
    }
}

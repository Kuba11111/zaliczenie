package zal.devices;

public class Car{
    public String model;
    public String producer;
    public String fuelType;
    public Double mileage;
    public Car car;

    public Car(String model, String producer, String fuelType, Double mileage){
        this.model = model;
        this.producer = producer;
        this.fuelType = fuelType;
        this.mileage = mileage;
    }
}

package zal.devices;


public class Car extends Device{
    public String fuelType;
    public Double mileage;
    public Car car;
    public Double value;

    public Car(String model, String producer, String fuelType, Double mileage, Double value, int yearOfProduction){
        this.model = model;
        this.producer = producer;
        this.fuelType = fuelType;
        this.mileage = mileage;
        this.value = value;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public void turnOn() {
        isOn = true;
    }

    @Override
    public String toString() {
        return "Car{" +
                "value=" + this.value +
                ", fuelType=" + this.fuelType +
                ", model='" + this.model + '\'' +
                ", producer='" + this.producer + '\'' +
                ", mileage='" + this.mileage + '\'' +
                ", value=" + this.value +
                '}';
    }
}

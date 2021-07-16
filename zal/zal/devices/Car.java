package zal.devices;

public class Car{
    public String model;
    public String producer;
    public String fuelType;
    public Double mileage;
    public Car car;
    public Double value;

    public Car(String model, String producer, String fuelType, Double mileage, Double value){
        this.model = model;
        this.producer = producer;
        this.fuelType = fuelType;
        this.mileage = mileage;
        this.value = value;
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

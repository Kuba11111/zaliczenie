package zal.devices;

import zal.Human;

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

    @Override
    public void sell(Human seller, Human buyer, double price) {
        if (this.value < buyer.cash)
        {
            buyer.cash -= price;
            seller.cash += price;
            buyer.setHumanCar(seller.getCar());
            seller.setHumanCar(null);
            System.out.println("Transakcja zostala wykonana");
        }
        else System.out.println("Transakcja nie zostala wykonana");
    }
}

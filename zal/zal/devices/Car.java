package zal.devices;

import zal.Human;

import java.util.Arrays;

public abstract class Car extends Device{
    public String fuelType;
    public Double mileage;
    public Car car;
    public Double value;
    double fuel = 0;

    public Car(String model, String producer, Double mileage, Double value, int yearOfProduction){
        this.model = model;
        this.producer = producer;
        this.mileage = mileage;
        this.value = value;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public void turnOn() {
        isOn = true;
    }

    public abstract void refuel();

    @Override
    public String toString() {
        return "Car{" +
                "value=" + this.value +
                ", fuelType=" + this.fuelType +
                ", model='" + this.model + '\'' +
                ", producer='" + this.producer + '\'' +
                ", mileage='" + this.mileage + '\'' +
                ", value=" + this.value +
                ", fuel=" + this.fuel +
                '}';
    }

    @Override
    public void sell(Human seller, Human buyer, double price) {
        boolean exist = Arrays.asList(seller.garage).contains(this);
        boolean emptySpace = false;
        for (Car parkingPlace : buyer.garage) {
            if (parkingPlace == null) {
                emptySpace = true;
                break;
            }
        }

        if (exist && emptySpace && this.value < buyer.cash)
        {
            for (int i=0;i< seller.garage.length;i++){
                if (seller.garage[i].equals(this)){
                    seller.garage[i] = null;
                    break;
                }
            }
            for (int i=0;i<buyer.garage.length;i++)
            {
                if(buyer.garage[i] == null){
                    buyer.garage[i] = this;
                    break;
                }
            }
            buyer.cash -= price;
            seller.cash += price;
            System.out.println("Transakcja zostala wykonana");
        }
        else System.out.println("Transakcja nie zostala wykonana");
    }
}

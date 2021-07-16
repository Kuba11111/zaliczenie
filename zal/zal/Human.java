package zal;

import zal.creatures.Animal;
import zal.devices.Car;

public class Human {
    public String firstName;
    public String lastName;
    public Double money;
    public Animal pet;
    public Car car;

    public Human(String firstName, String lastName, Double money){
        this.firstName = firstName;
        this.lastName = lastName;
        this.money = money;
    }
}

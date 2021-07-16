package zal;

import zal.creatures.Animal;
import zal.devices.Car;
import zal.devices.Phone;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Human {
    public String firstName;
    public String lastName;
    public Animal pet; 
    public Car[] garage;
    public Double salary;
    public double cash;
    public Phone phone;
    private static final int defaultGarageSize = 2;

    Human(String firstName, String lastName, Double money){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = money;
        garage = new Car[defaultGarageSize];
    }

    Human(String firstName, String lastName, Double money, int sizeOfGarage){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = money;
        garage = new Car[sizeOfGarage];
    }

    public double getSalary() {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        System.out.println("Date: " + localDate + "\nTime: " +  localTime + "\nSalary: "+this.salary);
        return salary;
    }

    public void setSalary(double money) {
        if(money>=0)
        {
            System.out.println("Nowe daty zostaly wyslane do systemu ksiegowego\nKonieczne jest odebranie aneksu od umowy od pani Hanny z kadr\nZUS i US juz wiedza o zmianie wyplaty, wiec ukrywanie wysokosci Panskiego dochodu jest bezcelowe");
            this.salary = money;
        }
        else System.out.println("Wyplata nie moze byc ujemna");
    }

    public Car getCar(int parkingPlace){
        return garage[parkingPlace];
    }

    public void setHumanCar(Car car, int parkingPlace){
        garage[parkingPlace] = car;
    }

    public void setPhone(Phone phone) {
        if(phone.value<salary) {
            System.out.println("Udalo sie kupic za gotowke");
            this.phone = phone;
            phone.transactions.add(new Transaction(null, this, phone.value,new Date()));
        }
        else System.out.println("Zapisz sie na studia i znajdz nowa robote albo idz po podwyzke");
    }

    public double garagePrice(){
        double sumOfPrices = 0;

        for (Car car:garage) {
            if(car != null) sumOfPrices += car.value;

        }
        return sumOfPrices;
    }

    public void garageSort(){
        for (int i=0;i<this.garage.length-1;i++) {
            Car helper;
            for (int j = 0;j<this.garage.length-(i+1);j++){
                if(this.garage[j]==null)
                {
                    this.garage[j] = this.garage[this.garage.length-(i+1)];
                    this.garage[this.garage.length-(i+1)] = null;
                }
                else if (this.garage[j+1]==null);
                else if(this.garage[j].yearOfProduction > this.garage[j+1].yearOfProduction)
                {
                    helper = this.garage[j];
                    this.garage[j] = this.garage[j+1];
                    this.garage[j+1] = helper;
                }
            }
        }
    }

    public void setCar(Car car, int parkingPlace) {
        if(car.value<this.salary) {
            System.out.println("Udalo sie kupic za gotowke");
            garage[parkingPlace] = car;
            car.transactions.add(new Transaction(null, this, car.value,new Date()));

        }
        else if ((car.value/12)<this.salary){
            System.out.println("Udalo sie kupic na kredyt");
            garage[parkingPlace] = car;
            car.transactions.add(new Transaction(null, this, car.value,new Date()));

        }
        else System.out.println("Zapisz sie na studia i znajdz nowa robote albo idz po podwyzke");
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + this.firstName + '\'' +
                ", lastName='" + this.lastName + '\'' +
                ", pet=" + pet +
                ", salary=" + salary +
                '}';
    }
}

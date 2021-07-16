package zal;

import zal.creatures.Animal;
import zal.devices.Car;

import java.time.LocalDate;
import java.time.LocalTime;

public class Human {
    public String firstName;
    public String lastName;
    public Animal pet; 
    private Car car;
    public Double salary;

    public Human(String firstName, String lastName, Double money){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = money;
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

    public Car getCar(){
        return this.car;
    }

    public void setCar(Car car) {
        if(car.value<this.salary) {
            System.out.println("Udalo sie kupic za gotowke");
            this.car = car;
        }
        else if ((car.value/12)<this.salary){
            System.out.println("Udalo sie kupic na kredyt");
            this.car = car;
        }
        else System.out.println("Zapisz sie na studia i znajdz nowa robote albo idz po podwyzke");
    }
}

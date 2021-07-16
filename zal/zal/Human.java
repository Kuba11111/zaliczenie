package zal;

import zal.creatures.Animal;
import zal.devices.Car;

import java.time.LocalDate;
import java.time.LocalTime;

public class Human {
    public String firstName;
    public String lastName;
    public Animal pet;
    public Car car;
    public Double Salary;

    public Human(String firstName, String lastName, Double money){
        this.firstName = firstName;
        this.lastName = lastName;
        this.Salary = money;
    }

    public double getSalary() {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        System.out.println("Date: " + localDate + "\nTime: " +  localTime + "\nSalary: "+this.Salary);
        return Salary;
    }

    public void setSalary(double money) {

        if(money>=0)
        {
            System.out.println("Nowe daty zostaly wyslane do systemu ksiegowego\nKonieczne jest odebranie aneksu od umowy od pani Hanny z kadr\nZUS i US juz wiedza o zmianie wyplaty, wiec ukrywanie wysokosci Panskiego dochodu jest bezcelowe");
            this.Salary = money;
        }
        else System.out.println("Wyplata nie moze byc ujemna");

    }
}

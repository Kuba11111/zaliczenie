package zal;

//import zal.creatures.Animal;
import zal.devices.Car;

public class Main {
    public static void main(String[] args){
    //zad 1
/*         Animal kot = new Animal("cat");
        kot.feed();
        System.out.println(kot.isAlive);
        kot.takeForAWalk();
        kot.takeForAWalk();
        kot.takeForAWalk();
        kot.takeForAWalk();
        kot.feed(); */
    //zad 2
/*         Car auto = new Car("a6", "audi", "diesel", 0.0);
        Human robert = new Human("Robert","Maklowicz", 100000.0);
        robert.car = auto; */
    //zad 3 i 4
/*         Human robert = new Human("Robert", "Maklowicz Jr.", 100000.0);
        robert.getSalary();
        robert.setSalary(100000); */
    //zad 5
        Car samochod = new Car("a6", "audi", "diesel", 0.0, 1000002.0);
        Human robert = new Human("Robert", "Maklowicz Jr.", 100000.0);
        robert.getCar();
        robert.setCar(samochod);
        robert.setSalary(1000000);
        robert.setCar(samochod);
        robert.setSalary(10);
        robert.setCar(samochod);
    }
}
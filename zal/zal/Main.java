package zal;

//import zal.creatures.Animal;
import zal.devices.*;

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
/*         Car samochod = new Car("a6", "audi", "diesel", 0.0, 1000002.0);
        Human robert = new Human("Robert", "Maklowicz Jr.", 100000.0);
        robert.getCar();
        robert.setCar(samochod);
        robert.setSalary(1000000);
        robert.setCar(samochod);
        robert.setSalary(10);
        robert.setCar(samochod); */
    //zad 6
/*         Car poj1 = new Car("a6", "audi", "diesel", 0.0, 1000002.0);
        Car poj2 = new Car("a6", "audi", "diesel", 0.0, 1000002.0);

        if(poj1.equals(poj2)) System.out.println(true);
        else System.out.println(false);

        System.out.println(poj1);
        System.out.println(poj2); */
    //zad 7
        Phone iPS45= new Phone("s45", "Apple", 10000.0);
        System.out.println(iPS45.isOn);
        iPS45.turnOn();
        System.out.println(iPS45.isOn);
    }
}
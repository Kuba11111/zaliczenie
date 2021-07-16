package zal;

import zal.creatures.Animal;
import zal.creatures.FarmAnimal;
import zal.creatures.Pet;
import zal.devices.*;

import java.util.Arrays;

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
/*         Phone iPS45= new Phone("s45", "Apple", 10000.0);
        System.out.println(iPS45.isOn);
        iPS45.turnOn();
        System.out.println(iPS45.isOn); */
    //zad8
/*         Human bartek = new Human("Bartek","Kowalski",5000.0);
        Human adam = new Human("Adam","Malinowski",8000.0);
        bartek.cash = 50000;
        adam.cash = 100000;


        bartek.pet = new Animal("cat","Yolololo", 10000.0);
        System.out.println(bartek);
        System.out.println(adam);

        bartek.pet.sell(bartek,adam,bartek.pet.price);

        System.out.println(bartek);
        System.out.println(adam); */
    //zad 9
/*         FarmAnimal krowa = new FarmAnimal("cow",15000,1);
        krowa.setWeight(900);
        System.out.println(krowa);
        krowa.feed();
        krowa.feed(250);
        System.out.println(krowa);
        krowa.beEaten();
        System.out.println(krowa); */
    //zad 10
/*         Phone iPS45= new Phone("s45", "Apple", 10000.0);
        System.out.println(iPS45);
        iPS45.installAnApp("Apka","v.12","https://www.stronka.pl");
        System.out.println(iPS45);

        Electric tesla = new Electric("Model X", "Tesla", 0.0, 650000, 2019);
        System.out.println(tesla);
        tesla.refuel();
        System.out.println(tesla); */
    //zad 11
/*         Electric tesla = new Electric("Model X", "Tesla", 0.0, 650000, 2019);
        Human albert = new Human("Albert","Kowalski",80000.0, 3);
        Human adam = new Human("Adam","Malinowski",8000.0);
        adam.cash = 1000000;
        albert.cash = 100;
        System.out.println(albert);
        albert.setCar(tesla,2);
        albert.setCar(new LPG("G63",    "Mercedes-AMG", 0.0, 255123, 2019),1);
        System.out.println(albert.garagePrice());
        System.out.println(Arrays.toString(albert.garage));
        albert.garageSort();
        System.out.println(Arrays.toString(albert.garage));
        System.out.println(Arrays.toString(adam.garage));
        albert.garage[0].sell(albert,adam,700000);
        System.out.println(Arrays.toString(albert.garage));
        System.out.println(Arrays.toString(adam.garage));
        System.out.println(albert.cash);
        System.out.println(adam.cash); */
    //zad 12 + 8
/*         Electric tesla = new Electric("Model X", "Tesla", 0.0, 650000, 2019);
        Human bartek = new Human("Bartek","Kowalski",5000.0, 5);
        bartek.setHumanCar(tesla, 0);
        Human adam = new Human("Adam","Malinowski",8000.0, 5);
        bartek.cash = 50000.0;
        adam.cash = 100000000.0;

        System.out.println(bartek);
        System.out.println(adam);

        bartek.getCar(0).sell(bartek,adam,bartek.getCar(0).value);

        System.out.println(bartek);
        System.out.println(adam);
        System.out.println(tesla.transactions);
        System.out.println(tesla.isOwner(adam));
        System.out.println(tesla.isOwner(bartek));
        System.out.println(tesla.didSell(bartek,adam));
        System.out.println(tesla.didSell(adam,bartek));
        System.out.println(tesla.numberOfTransactions()); */
    //zad 13
        Human bartek = new Human("Bartek","Kowalski",50000000.0, 5);
        Phone iPS45= new Phone("s45", "Apple", 10000.0);
        iPS45.installAnApp(new Application("Test","1.0",2000));
        bartek.setPhone(iPS45);
        iPS45.installAnApp(new Application("Test","1.0",2000));
        bartek.cash+=7000;
        System.out.println(bartek);
        iPS45.installAnApp(new Application("Test","1.0",200));
        Application apka = new Application("ATetris","5.2",500);
        Application apka1 = new Application("Bobo","2.2",0);
        Application apka2 = new Application("Monsterek","6.1",250);
        System.out.println(bartek);

        System.out.println(iPS45.isInstalled(apka));
        System.out.println(iPS45.isInstalled("Test"));
        iPS45.installAnApp(apka);
        iPS45.installAnApp(apka1);
        iPS45.installAnApp(apka2);
        System.out.println(iPS45.isInstalled(apka));

        iPS45.freeApps();

        System.out.println(iPS45.sumOfAppssValues());
        iPS45.sortAppsByName();
        iPS45.sortAppsByPrice();
    }
}
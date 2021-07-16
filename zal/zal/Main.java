package zal;

import zal.creatures.Animal;

public class Main {
    public static void main(String[] args){
    //zad 1
        Animal kot = new Animal("cat");
        kot.feed();
        System.out.println(kot.isAlive);
        kot.takeForAWalk();
        kot.takeForAWalk();
        kot.takeForAWalk();
        kot.takeForAWalk();
        kot.feed();
    }
}
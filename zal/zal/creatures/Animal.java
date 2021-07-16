package zal.creatures;

import zal.Human;
import zal.Sellable;
import zal.Transaction;

public abstract class Animal implements Sellable, Feedable {
    public boolean isAlive = true;
    public String species;
    public double weight;
    public String name;
    public Double price;

    public Animal(String species, String name, Double value){
        this.species = species;
        this.name = name;
        this.price = value;
        switch(species){
            case "cat":
                this.weight = 4.5;
                break;
            case "dog":
                this.weight= 20;
                break;
            case "rabbit":
                this.weight= 1.2;
                break;
            case "horse":
                this.weight= 600;
                break;
            default:
                this.weight= 50;
                break;
        }
    }

    public Animal(String species, Double value){
        this.species = species;
        this.price = value;
        switch(species){
            case "cat":
                this.weight = 4.5;
                break;
            case "dog":
                this.weight= 20;
                break;
            case "rabbit":
                this.weight= 1.2;
                break;
            case "horse":
                this.weight= 600;
                break;
            default:
                this.weight= 50;
                break;
        }
    }

    public void setWeight(double weight) {
        this.weight = weight;
    } 

    public void feed(){
        if (isAlive) this.weight+=3;
        else System.out.println("Ciezko nakarmic martwe zwierze");
    }

    public void feed(double foodWeight){
        if (isAlive) this.weight+=foodWeight;
        else System.out.println("Ciezko nakarmic martwe zwierze");
    }

    public void takeForAWalk()
    {
        if (isAlive) {
            weight -= 3;
            if (weight <= 0) {
                weight = 0;
                isAlive = false;
            }
        }
        else System.out.println("Powodzenia z wyprowadzeniem martwego zwierzecia");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + this.species + '\'' +
                ", weight=" + this.weight +
                ", isAlive=" + this.isAlive +
                '}';
    }

    @Override
    public void sell(Human seller, Human buyer, double price) {
        if (seller.pet.equals(this) && buyer.cash>this.price)
        {
            buyer.cash -= this.price;
            seller.cash += this.price;
            buyer.pet = seller.pet;
            seller.pet = null;
            System.out.println("Transakcja zostala wykonana");
        }
        else System.out.println("Transakcja nie zostala wykonana");
    }
}

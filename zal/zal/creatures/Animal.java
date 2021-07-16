package zal.creatures;

public class Animal {
    public boolean isAlive = true;
    final String species;
    public double weight;

    public Animal(String species){
        this.species = species;
        switch(species){
            case "cat":
                weight = 4.5;
                break;
            case "dog":
                weight= 20;
                break;
            case "rabbit":
                weight= 1.2;
                break;
            case "horse":
                weight= 600;
                break;
            default:
                weight= 50;
                break;
        }
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
}

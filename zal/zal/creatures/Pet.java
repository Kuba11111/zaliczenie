package zal.creatures;

public class Pet extends Animal {
    public String name;

    public Pet(String species, double price, String name) {
        super(species, name, price);
        this.name = name;
    }
}

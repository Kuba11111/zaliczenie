package zal.creatures;

public class FarmAnimal extends Animal implements Edbile {
    int id_number;

    public FarmAnimal(String species, double price, int id_number) {
        super(species, price);
        this.id_number = id_number;
    }

    public void beEaten() {
        isAlive = false;
    }

    @Override
    public String toString() {
        return "FarmAnimal{" +
                "species='" + species + '\'' +
                ", isAlive=" + isAlive +
                ", price=" + price +
                ", id_number=" + id_number +
                ", weight=" + weight +
                '}';
    }
}

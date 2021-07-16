package zal.devices;

public class Application {
    String name;
    String version;
    double price;

    public Application(String name, String version, double price) {
        this.name = name;
        this.version = version;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Application{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                ", price=" + price +
                '}';
    }
}

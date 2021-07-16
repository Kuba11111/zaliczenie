package zal.devices;

import zal.Sellable;

public abstract class Device implements Sellable {
    String model;
    String producer;
    public int yearOfProduction;
    public boolean isOn = false;
    public double value;
 
    @Override
    public String toString() {
        return "Device{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    public abstract void turnOn();
}

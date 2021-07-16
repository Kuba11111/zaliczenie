package zal.devices;

import zal.Sellable;
import zal.Transaction;

import java.util.ArrayList;

public abstract class Device implements Sellable {
    String model;
    String producer;
    public int yearOfProduction;
    public boolean isOn = false;
    public double value;
    public ArrayList<Transaction> transactions = new ArrayList<Transaction>();
 
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

package zal.devices;

import zal.Human;

import java.net.URL;

public class Phone extends Device {
    String os;
    String appName;
    String appVersion = defaultAppVersion;
    String appServerAddress = defaultAppServerAddress;
    String appProtocol = defaultAppProtocol;
    static final String defaultAppVersion = "1.0";
    static final String defaultAppServerAddress = "0.0.0.0";
    static final String defaultAppProtocol = "HTTPS";

    public Phone(String model, String producer, double value){
        this.model = model;
        this.producer = producer;
        if(model == "Apple"){
            this.os = model;
        }else this.os = "Android";
        this.value = value;
    }

    @Override
    public void turnOn() {
        isOn = true;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", isOn=" + isOn +
                ", value=" + value +
                ", os='" + os + '\'' +
                '}';
    }

    @Override
    public void sell(Human seller, Human buyer, double price) {
        if (seller.phone.equals(this) && buyer.cash>this.value)
        {
            buyer.cash -= this.value;
            seller.cash += this.value;
            buyer.phone = seller.phone;
            seller.phone = null;
            System.out.println("Transakcja zostala wykonana");
        }
        else System.out.println("Transakcja nie zostala wykonana");
    }

    public void installAnApp(String name){
        this.appName = name;
    }

    public void installAnApp(String name, String version){
        this.appName = name;
        this.appVersion = version;
    }

    public void installanApp(URL url){
        this.appProtocol = url.getProtocol();
        this.appName = url.getFile();
        this.appServerAddress = url.getHost();
    }

    public void installAnApp(String name, String version, String server_address){
        this.appName = name;
        this.appVersion = version;
        this.appServerAddress = server_address;
    }
}

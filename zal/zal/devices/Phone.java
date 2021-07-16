package zal.devices;

import zal.Human;
import zal.Transaction;

//import java.net.URL;
import java.util.*;

public class Phone extends Device {
    String os;
    String appName;
    String appVersion = defaultAppVersion;
    String appServerAddress = defaultAppServerAddress;
    String appProtocol = defaultAppProtocol;
    static final String defaultAppVersion = "1.0";
    static final String defaultAppServerAddress = "0.0.0.0";
    static final String defaultAppProtocol = "HTTPS";

    Set<Application> apps = new HashSet<>();

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

    public void installAnApp(Application app){

        try{
            Transaction tr = this.transactions.get(this.transactions.size()-1);

            if(tr.buyer.cash>app.price)
            {
                this.apps.add(app);
                tr.buyer.cash -= app.price;
                System.out.println("Transakcja zostala wykonana");
            }
            else System.out.println("Transakcja nie zostala wykonana");

        } catch (Exception ex){
            System.out.println("Telefon nie posiada wlasciciela");
        }
    }

    public boolean isInstalled(Application application)
    {
        return this.apps.contains(application);
    }

    public boolean isInstalled(String name)
    {
        for(Application app : this.apps){
            if(app.name.equals(name)) return true;
        }
        return false;
    }

    public void freeApps(){
        for(Application app : this.apps){
            if(app.price == 0) System.out.println(app);
        }
    }

    public double sumOfAppssValues(){
        double sum = 0;
        for(Application app : this.apps){
            sum += app.price;
        }
        return sum;
    }

    public void sortAppsByName()
    {
        ArrayList<Application> sortedApps = new ArrayList<Application>(apps);

        System.out.println(this.apps);
        Application helper;
        for(int i=0;i<sortedApps.size()-1;i++)
        {
            for (int j=0;j<sortedApps.size()-(i+1);j++)
            {
                if ((sortedApps.get(j).name).compareTo(sortedApps.get(j+1).name)>0){
                   helper = sortedApps.get(j);
                    sortedApps.set(j, sortedApps.get(j+1));
                    sortedApps.set(j+1,helper);
                }
            }

        }
        for (Application app:sortedApps
             ) {
            System.out.println(app.name);
        }
    }
    public void sortAppsByPrice()
    {
        ArrayList<Application> sortedApps = new ArrayList<Application>(apps);

        System.out.println(this.apps);
        Application helper;
        for(int i=0;i<sortedApps.size()-1;i++)
        {
            for (int j=0;j<sortedApps.size()-(i+1);j++)
            {
                if ((sortedApps.get(j).price)>(sortedApps.get(j+1).price)){
                    helper = sortedApps.get(j);
                    sortedApps.set(j, sortedApps.get(j+1));
                    sortedApps.set(j+1,helper);
                }
            }

        }
        for (Application app:sortedApps
        ) {
            System.out.println(app.name);
        }
    }
}

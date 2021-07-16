package zal.devices;

import zal.Human;

public class Phone extends Device {
    String os;

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
}

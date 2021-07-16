package zal.devices;

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
}

class Appliance {
    protected String brand;
    protected int power;
    public Appliance(String brand, int power) {
        this.brand = brand;
        this.power = power;

    }
    public void turnOn () {
        System.out.println(brand + " appliance is now ON.");
    }

    public void turnOff(){
        System.out.println(brand + " the appliance is now OFF");

    }

    public String getBrand() {
        return brand;
    }
    
    public int getPower() {
        return power;
    }
}

class WashingMachine extends Appliance {
    private double capacity; 

    public WashingMachine(String brand, int power, double capacity){
        super(brand, power);
        this.capacity = capacity;
    }

    @Override
    public void turnOn() {
        System.out.println(brand + " washing washing is starting.");
    }
    
    @Override
    public void turnOff() {
        System.out.println(brand + "washing washing is turning off");
    }
    public void StartWash(){
        System.out.println("WashingClothes.........");

    }

}

class Refrigerator extends Appliance {
    private double temperature;

    public Refrigerator(String brand, int power, double temperature) {
        super(brand, power);
        this.temperature = temperature;
    }

    @Override
    public void turnOn() {
        System.out.println(brand + " refrigerator is cooling.");
    }

    @Override
    public void turnOff() {
        System.out.println(brand + " refrigerator is off.");
    }

    public void setTemperature(double temp) {
        this.temperature = temp;
        System.out.println("Temperature set to " + temp + "°C.");
    }
}


class Television extends Appliance {
    private double screenSize;

    public Television(String brand, int power, double screenSize) {
        super(brand, power);
        this.screenSize = screenSize;
    }

    @Override
    public void turnOn() {
        System.out.println(brand + " TV is now on.");
    }

    @Override
    public void turnOff() {
        System.out.println(brand + " TV is now off.");
    }

    public void changeChannel(int channel) {
        System.out.println("Changing to channel " + channel + ".");
    }
}

public class ApplianceTest {
    public static void main(String[] args) {
        Appliance appliance;

        appliance = new WashingMachine("Samsung", 2000, 7.5);
        appliance.turnOn();
        appliance.turnOff();

        appliance = new Television("LG", 180, 55);
        appliance.turnOn();
        appliance.turnOff();

        appliance = new Refrigerator("Sony", 300, 4.0);
        appliance.turnOn();
        appliance.turnOff();
    }
}
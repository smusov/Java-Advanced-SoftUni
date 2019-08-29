package CarConstructors;

public class Car {

    private String make;
    private String model;
    private int horsePower;

    public Car(String make, String model, int horsePower) {
        this.make = make;
        this.model = model;
        this.horsePower = horsePower;
    }

    public Car(String make) {
        this.make = make;
        this.model = "unknown";
        this.horsePower = -1;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public String getInfo(){

        return String.format("The car is: %s %s - %d HP.",getMake(),getModel(),getHorsePower());
    }
}

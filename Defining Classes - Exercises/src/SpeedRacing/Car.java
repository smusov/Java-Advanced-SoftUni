package SpeedRacing;

public class Car {

    private String model;
    private double fuelAmount;
    private double fuelCostPerKM;
    private int distanceTraveled;

    public Car(String model, int fuelAmount, double fuelCostPerKM) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostPerKM = fuelCostPerKM;
    }

    private double getFuelCostPerKM (){
        return this.fuelCostPerKM;
    }


    public void setFuelAmount(double fuelAmount){
        this.fuelAmount = fuelAmount;
    }


    public void setDistanceTraveled (int kilometers){
        distanceTraveled+=kilometers;
    }

    public double needFuelForDistance(int distance){
        return this.fuelAmount-(distance*getFuelCostPerKM());
    }
    public String printByPattern (){
        return String.format("%s %.2f %d",model,fuelAmount,Car.this.distanceTraveled);
    }
}

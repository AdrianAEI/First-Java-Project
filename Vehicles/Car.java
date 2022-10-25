package Vehicles;

public abstract class Car extends Vehicle{
protected boolean airConditioning;
protected boolean parkingSensor;
protected double maxPassengers;


    public Car(String name,double engineCapacity, String color, String brandName, int mileage, int HP, boolean airConditioning, boolean parkingSensor, double maxPassengers) {
        super(name,engineCapacity, color, brandName, mileage, HP);
        this.airConditioning = airConditioning;
        this.parkingSensor = parkingSensor;
        this.maxPassengers = maxPassengers;
    }
}

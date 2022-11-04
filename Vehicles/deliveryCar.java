package Vehicles;

import java.util.Vector;

public class deliveryCar extends Car{
    private float capacity;

    public deliveryCar(String name,double cost,double engineCapacity, String color, String brandName, int mileage, int HP, boolean airConditioning, boolean parkingSensor, double maxPassengers, float capacity) {
        super(name,cost,engineCapacity, color, brandName, mileage, HP, airConditioning, parkingSensor, maxPassengers);
        this.capacity = capacity;
    }

}

package Vehicles;

import java.util.Vector;

public class Motorbike extends Vehicle {
    private final int Vmax;

    public Motorbike(String name,double engineCapacity, String color, String brandName, int mileage, int HP, int Vmax) {
        super(name,engineCapacity, color, brandName, mileage, HP);
        this.Vmax = Math.min(Vmax,240);
    }
}

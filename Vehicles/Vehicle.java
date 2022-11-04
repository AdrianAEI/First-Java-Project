package Vehicles;

import java.util.Arrays;
import java.util.List;

public abstract class Vehicle  {
protected double engineCapacity;
protected double cost;
protected String color;
protected String brandName;
protected int mileage;
protected int HP;
protected String name;

    public Vehicle(String name,double cost,double engineCapacity, String color, String brandName, int mileage, int HP) {
        this.name=name;
        this.cost=cost;
        this.engineCapacity = engineCapacity;
        this.color = color;
        this.brandName = brandName;
        this.mileage = mileage;
        this.HP = HP;
    }

    public String getColor() {
        return color;
    }

    public int getMileage() {
        return mileage;
    }

    public int getHP() {
        return HP;
    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getBrandName()
    {
        return brandName;
    };
    public double getEngineCapacity()
    {
        return engineCapacity;
    };
    public List<Object> getDetails()
    {
        return Arrays.asList(name,brandName,engineCapacity,color,mileage,HP);
    }


}

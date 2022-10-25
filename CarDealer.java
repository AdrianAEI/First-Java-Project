import People.*;
import Vehicles.*;
import java.util.Vector;

public class CarDealer {
    private Vector<Vehicle> Vehicles = new Vector<>();
    private Vector<Human> People = new Vector<>();
    private  int money;
    public CarDealer(Vector<Vehicle> vehicles, Vector<Human> people) {
        Vehicles = vehicles;
        People = people;
        this.money = 100000;
    }

    public CarDealer() {
    }
    //add some test vehicles
    public void testInitCarDealer() {
        Vehicle a4= new passengerCar("a4",3700,"grey","audi",309000,320,true,true,5);
        Vehicle m5= new passengerCar("m5",3000,"black","bmw",230000,420,true,true,5);
        Vehicle amg= new passengerCar("amg",5000,"white","mercedes",20000,520,true,true,5);
        Vehicle doblo= new deliveryCar("doblo",1600,"white","fiat",10000,120,true,true,2,500);
        Vehicle suzuki750= new Motorbike("suzuki750",750,"red","suzuki",230,150,280);
        this.buyCar(a4);
        this.buyCar(m5);
        this.buyCar(amg);
        this.buyCar(doblo);
        this.buyCar(suzuki750);
    }


    //to do
    public Vector<Human> getPeople() {
        return People;
    }

    public void dismissEmployee()
    {

    }
    public void employ()
    {

    }
    //client
    public void buyCar(Vehicle vehicle)
    {
        Vehicles.add(vehicle);
    }
    public void sellCar(String carName)
    {
        for(Vehicle vehicle: Vehicles)
        {
            if(carName.equals(vehicle.getName())){
                Vehicles.remove(vehicle);
                break;
            }
        }
    }
    //see information about all cars
    public void getVehicles() {
        System.out.println("Vehicles:");
        for(Vehicle vehicle: Vehicles)
        {
            System.out.println(vehicle.getDetails());
        }
    }
    //see information about one car
    public void getInformation(String carName)
    {
        for(Vehicle vehicle: Vehicles)
        {
            if(carName.equals(vehicle.getName()))
                System.out.println(vehicle.getDetails());
            //to do if not found
        }
    }
}

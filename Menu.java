import Vehicles.Vehicle;
import Vehicles.passengerCar;

import java.util.Scanner;

public class Menu {

    CarDealer dealer;

    public Menu(CarDealer dealer) {
        this.dealer = dealer;
    }

    public void initMenu() {
        boolean run=true;
        Scanner scanner;
        int choose;
        String carChoose1;

        System.out.println("Welcome to your favourite carDealer!");
        while(run)
        {
            //client panel
            System.out.println("Choose what you want to do");
            System.out.println("1.Sell car");
            System.out.println("2.Buy car");
            System.out.println("3.See information's about  all cars");
            System.out.println("4.See information's about one car");
            System.out.println("5.Close");
            scanner = new Scanner(System.in);
            choose= scanner.nextInt();
            if(choose == 1)
            {
                System.out.println("Input name of the car that you want to sell:");
                scanner = new Scanner(System.in);
                carChoose1=scanner.nextLine();
                Vehicle newCar = new passengerCar(carChoose1,420,"testColor","testBrand",4200,420,false,false,5);
                dealer.buyCar(newCar); // buy because dealer is buying new car from client
            }
            else if(choose==2)
            {
                System.out.println("Input name of the car that you want to buy:");
                scanner = new Scanner(System.in);
                carChoose1=scanner.nextLine();
                dealer.sellCar(carChoose1);
            }
            else if(choose==3)
            {
                System.out.println("The list of vehicles: ");
                dealer.getVehicles();
            }
            else if(choose==4)
            {
                System.out.println("Input name of the car that you want to see:");
                scanner = new Scanner(System.in);
                carChoose1=scanner.nextLine();
                dealer.getInformation(carChoose1);
            }
            else if(choose==5)
            {
                System.out.println("Bye bye");
                run=false;
            }
            else
            {
                System.out.println("Bad option! Try again!");
            }
        }
    }
}

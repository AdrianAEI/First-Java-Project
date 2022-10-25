import Vehicles.*;
//to do search by name

public class Main {
    public static void main(String[] args) {
        //to do administration panel
        //now works only client panel
        CarDealer dealer =new CarDealer();
        dealer.testInitCarDealer();
        Menu menu=new Menu(dealer);
        menu.initMenu();
    }
}
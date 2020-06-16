package exercise3;

import exercise3.destinations.DestinationDesk;
import exercise3.observer.EmployeeObserver;
import exercise3.observer.Observer;
import exercise3.state.NewOrderState;
import exercise3.state.Order;
import exercise3.destinations.InternationalDestinationDesk;
import exercise3.destinations.NationalDestinationDesk;
import exercise3.destinations.PlovdivDestinationDesk;

public class MainClass {
    public static void main(String[] args) {

        Observer employeeObserver = new EmployeeObserver();

        DestinationDesk internationalDestinationDesk = new InternationalDestinationDesk();
        internationalDestinationDesk.subscribe(employeeObserver);
        internationalDestinationDesk.newOrder(new Order("International","Ivan" , "France"));
        internationalDestinationDesk.newOrder(new Order("International","Gosho" ,"Ukraine"));


        DestinationDesk nationalDestinationDesk = new NationalDestinationDesk();
        nationalDestinationDesk.subscribe(employeeObserver);
        nationalDestinationDesk.newOrder(new Order("National","Pesho", "Varna" ));


        DestinationDesk plovdivDestinationDesk = new PlovdivDestinationDesk();
        plovdivDestinationDesk.subscribe(employeeObserver);
        plovdivDestinationDesk.newOrder(new Order("Plovdiv","Pavka", "Center Plovdiv" ));


    }
}

import model.*;
import java.util.Date;

public class main {
    public static void main(String[] args){
        System.out.println("Hello");

        /** Sample to get information **/
        // Want to check flight's passenger's number.
        // Search 'Flight' from Database according to its primary key (flight code).
        // While the database is not connected now, use a dummy flight.
        Flight flightCA1929 = new Flight("CA1929", 0, "CA982", new Date()
                        ,999.92, 103, "JFK019", "PVG002", "19");
        System.out.println("Check flight's passenger's number:" + flightCA1929.getPassengerNo());
    }
}

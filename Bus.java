
package coursework.utms;


public class Bus extends Vehicle implements Serviceable, Schedulable, Trackable {

    public Bus(String vehicleID, String model, int capacity,String assignedriver,String assignedroute) {
        super(vehicleID, model, capacity, assignedriver, assignedroute);
    }

    @Override
    public void serviceVehicle() {
        System.out.println("Bus " + getVehicleID() + " is being serviced at the Makerere mechanical garage in Wandegeya.");
    }

    @Override
    public void scheduleRoute(String route) {
        System.out.println("Bus " + getVehicleID() + " is scheduled to travel along route: " + route);
    }

    @Override
    public void trackLocation() {
        System.out.println("Bus " + getVehicleID() + " is currently near Clock Tower heading to Ndeeba.");
    }
}



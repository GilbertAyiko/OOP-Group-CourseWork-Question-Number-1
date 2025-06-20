
package coursework.utms;


public class Van extends Vehicle implements Serviceable, Schedulable, Trackable {

    public Van(String vehicleID, String model, int capacity,String assignedriver,String assignedroute) {
        super(vehicleID, model, capacity, assignedriver,assignedroute);
    }

    @Override
    public void serviceVehicle() {
        System.out.println("Van " + getVehicleID() + " is undergoing oil change at Total Garage, Bwaise.");
    }

    @Override
    public void scheduleRoute(String route) {
        System.out.println("Van " + getVehicleID() + " is scheduled to transport students along route: " + route);
    }

    @Override
    public void trackLocation() {
        System.out.println("Van " + getVehicleID() + " is currently at Nakawa, heading  to Jinja Road.");
    }
}



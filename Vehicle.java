
package coursework.utms;


public abstract class Vehicle {
    private String vehicleID;
    private String model;
    private int capacity;
    private String assignedRoute;   
    private String assignedDriver;

    // Constructor
    public Vehicle(String vehicleID, String model, int capacity,String assignedDriver,String assignedRoute) {
        this.vehicleID = vehicleID;
        this.model = model;
        this.capacity = capacity;
        this.assignedRoute = assignedRoute;
        this.assignedDriver = assignedDriver;
    }

    // Getters
    public String getVehicleID() {
        return vehicleID;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getAssignedRoute() {
        return assignedRoute;
    }

    public String getAssignedDriver() {
        return assignedDriver;
    }

    // Setters
    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setAssignedRoute(String assignedRoute) {
        this.assignedRoute = assignedRoute;
    }

    public void setAssignedDriver(String assignedDriver) {
        this.assignedDriver = assignedDriver;
    }

    // Abstract methods - must be implemented by subclasses
    public abstract void serviceVehicle();

    public abstract void scheduleRoute(String route);

    // Concrete method (normal method)
    public void displayInfo() {
        System.out.println("Vehicle ID: " + vehicleID +
                           ", Model: " + model +
                           ", Capacity: " + capacity +
                           ", Assigned Route: " + (assignedRoute != null ? assignedRoute : "None") +
                           ", Assigned Driver: " + (assignedDriver != null ? assignedDriver : "None"));
    }
}

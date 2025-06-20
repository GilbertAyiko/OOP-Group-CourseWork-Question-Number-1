
package coursework.utms;


public class Main {
    public static void main(String[] args) {
        //  users
        Student student1 = new Student("001", "Lukwago Francis", "francis@vu.ac.ug", "pass1", "S001", "ST");
        Student student2 = new Student("002", "Namutebi Justin", "justin@vu.ac.ug", "pass2", "S002", "Law");
        Lecturer lecturer = new Lecturer("003", "Dr. Jane", "jane@vu.ac.ug", "pass3", "Health Science");
        TransportOfficer officer = new TransportOfficer("004", "Mr. Brian", "brian@vu.ac.ug", "pass4", "TO101", "Morning");

        // Login representation
        System.out.println("LOGING IN");
        
        if (student1.login("francis@vu.ac.ug", "pass1")) {
            System.out.println(student1.getName() + " from "+"faculty" +" "+ student1.getFaculty() + " logged in successfully.");
        }
        if (student2.login("justin@vu.ac.ug", "pass2")) {
            System.out.println(student2.getName() + " from "+"faculty"+ " "+ student2.getFaculty() + " logged in successfully.");
        }
        if (lecturer.login("jane@vu.ac.ug", "pass3")) {
            System.out.println(lecturer.getName() + " from " +"department"+" "+lecturer.getDepartment() +" logged in successfully.");
        }
        if (officer.login("brian@vu.ac.ug", "pass4")) {
            System.out.println(officer.getName() + " with Officer ID " + officer.getOfficerId() + " logged in successfully.");
        }
        
         
        
        // override
        
        System.out.println();
        System.out.println("METHOD OVERRIDE");
        
        System.out.println(student1.requestTransport("Mbarara", "9:00AM", "ITseminar","bus."));
        System.out.println(student2.requestTransport("Jinja", "10:00 AM", "Court visit","bus."));
        System.out.println(lecturer.requestTransport("N.Uganda", "11:00 AM", "Health research","van."));
        System.out.println(officer.requestTransport("Entebbe", "12:00 PM", "Pick students","suppervising assignment."));
        
        // overloading
        System.out.println("");
        System.out.println("METHOD OVERLOADING");
        officer.assignDriver();
        officer.assignDriver("Van");
        officer.assignDriver("Evening", "DRV456");
        System.out.println("");
        
        // Vehicles
        System.out.println("");
        System.out.println("VEHICLE INFORMATION");
        Bus bus = new Bus("B001", "Tata" , 50,"kampala-mbarara","Gilbert");
        Van van = new Van("V001","Toyota Hiace", 15,"Kampala-Gulu","Geofrey");
        bus.displayInfo();
        van.displayInfo();
        System.out.println("");
        
        //DEMONSTRATING SETTERS AND GETTERS
        System.out.println("");
        System.out.println("DEMONSTRATING SETTERS AND GETTERS");
        
        System.out.println("Original Capacity of Van: " + van.getCapacity());
        van.setCapacity(18);
        System.out.println("Updated Capacity of Van: " + van.getCapacity());
        System.out.println();
        
        // interfaces
        System.out.println("");
        System.out.println("INTERFACES IMPLEMENTED BY ALL VEHICLES");
        
        System.out.println("");
        bus.scheduleRoute("Kampala-Mbarara");
        bus.serviceVehicle();
        bus.trackLocation();
        System.out.println("");
        
        System.out.println("");
        System.out.println("");
        van.scheduleRoute("Kampala-Jinja");
        van.serviceVehicle();
        van.trackLocation();
    }
}

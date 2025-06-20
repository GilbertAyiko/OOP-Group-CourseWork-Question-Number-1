
package coursework.utms;





public class Lecturer extends User {
    private String department;

    public Lecturer(String userId, String name, String email, String password, String department) {
        super(userId, name, email, password);
        this.department = department;
    }

    @Override
    public String requestTransport(String destination, String time, String reason,String action) {
        return "Lecturer " + getName() + " (Department: "+ department + ") requested transport to " +
                destination + " at " + time + ". Reason: " + reason + " Action needed:" + action;
    }

    public String getDepartment() {
        return department;
    }
}


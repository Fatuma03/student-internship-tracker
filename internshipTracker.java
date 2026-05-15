import java.util.ArrayList;

public class internshipTracker {
    private ArrayList<Application> applications;

    public internshipTracker() {
        applications = new ArrayList<>();
    }

    public void addApplication(Application application) {
        applications.add(application);
        System.out.println("Application added successfully");
    }

    public void viewApplications() {
        if (applications.isEmpty()) {
            System.out.println("No applications found.");
        } else {
            System.out.println("\n Your Internship Applications");
            for (int i = 0; i < applications.size(); i++) {
                System.out.println((i + 1) + ". " + applications.get(i));
            }
        }
    }
}

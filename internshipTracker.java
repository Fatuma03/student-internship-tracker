import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

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

    public void updateApplicationStatus(int index, String newSatus) {
        if (index >= 0 && index < applications.size()) {
            Application app = applications.get(index);
            app.setStatus(newSatus);
            System.out.println("Application Status updated Successfully");
        } else {
            System.out.println("Invalid application Number");
        }

    }

    public void saveApplication() {
        try {
            FileWriter writer = new FileWriter("applications.txt");

            for (int i = 0; i < applications.size(); i++) {
                Application app = applications.get(i);
                writer.write(app.getCompanyName() + "," +
                        app.getPositionTitle() + "," +
                        app.getDateApplied() + "," +
                        app.getStatus() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("An error ocurred while saving application.");
        }

    }

    public void loadApplication() {
        try {
            File file = new File("applications.txt");
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    Application app = new Application(parts[0], parts[1], parts[2], parts[3]);
                    applications.add(app);
                }
            }
            fileReader.close();
        } catch (IOException e) {
            System.out.println("No saved Applications found yet");
        }

    }
}

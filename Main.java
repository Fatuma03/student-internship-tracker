import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        internshipTracker tracker = new internshipTracker();
        tracker.loadApplication();
        boolean running = true;
        while (running) {
            System.out.println("\nStudent Internship Tracker");
            System.out.println("1. Add an application");
            System.out.println("2. View all  application");
            System.out.println("3. Update Application Status");
            System.out.println("4. Exit.");
            System.out.print("Choose an Option: ");
            String choose = input.nextLine();
            if (choose.equals("1")) {
                System.out.print("Enter company name: ");
                String companyName = input.nextLine();

                System.out.print("Enter position title: ");
                String positionTitle = input.nextLine();

                System.out.print("Enter date applied: ");
                String dateApplied = input.nextLine();

                System.out.print("Enter status: ");
                String status = input.nextLine();

                Application application = new Application(companyName, positionTitle, dateApplied, status);
                tracker.addApplication(application);
                tracker.saveApplication();
            } else if (choose.equals("2")) {
                tracker.viewApplications();
            } else if (choose.equals("3")) {
                tracker.viewApplications();
                System.out.println("Choose an application");
                int ApplicationNumber = Integer.parseInt(input.nextLine());
                System.out.println("Enter a new status");
                String newStatus = input.nextLine();
                tracker.updateApplicationStatus(ApplicationNumber - 1, newStatus);
                tracker.saveApplication();

            } else if (choose.equals("4")) {
                running = false;
                System.out.println("Goodbye!");
            } else {
                System.out.println("Invalid choice. Please try again");
            }
        }
        input.close();
    }
}
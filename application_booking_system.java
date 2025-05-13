import java.util.*;

public class AppointmentSystem {
    static Map<String, String> bookings = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Book Slot\n2. View Appointments\n3. Cancel Appointment\n4. Exit");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Time Slot (e.g., 10AM-11AM): ");
                    String slot = sc.nextLine();
                    if (!bookings.containsKey(slot)) {
                        bookings.put(slot, name);
                        System.out.println("Appointment booked.");
                    } else {
                        System.out.println("Slot already booked.");
                    }
                    break;
                case 2:
                    if (bookings.isEmpty()) {
                        System.out.println("No appointments.");
                    } else {
                        bookings.forEach((k, v) -> System.out.println(k + " - " + v));
                    }
                    break;
                case 3:
                    System.out.print("Enter Time Slot to Cancel: ");
                    String cancelSlot = sc.nextLine();
                    if (bookings.containsKey(cancelSlot)) {
                        bookings.remove(cancelSlot);
                        System.out.println("Appointment canceled.");
                    } else {
                        System.out.println("No such slot.");
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

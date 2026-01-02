import java.util.Scanner;
public class HotelReservationSystem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Hotel hotel = new Hotel();
        int choice;

        do {
            System.out.println("\n--- Hotel Reservation System ---");
            System.out.println("1. View Available Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Exit");
            System.out.println("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    hotel.displayRooms();
                    break;
                case 2:
                    System.out.print("Enter your name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter room category (Standard/Deluxe/Suite): ");
                    String category = sc.nextLine();
                    System.out.println("Processing payment...");
                    hotel.bookRoom(name, category);
                    break;
                case 3:
                    System.out.print("Enter room number to cancel: ");
                    int roomNo = sc.nextInt();
                    hotel.cancelBooking(roomNo);
                    break;
                case 4:
                    System.out.println("Thank you for using our service!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }while(choice != 4);
        sc.close();
    }
}
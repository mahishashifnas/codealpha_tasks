import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Hotel {
    ArrayList<Room> rooms = new ArrayList<>();

    Hotel() {
        rooms.add(new Room(101,"Standard"));
        rooms.add(new Room(102,"Standard"));
        rooms.add(new Room(201,"Deluxe"));
        rooms.add(new Room(202,"Deluxe"));
        rooms.add(new Room(301,"Suite"));
    }
    void displayRooms() {
        System.out.println("\nAvailable Rooms:");
        for(Room room : rooms) {
            if(room.isAvailable) {
                System.out.println("Room " + room.roomNumber + " - " + room.category);
            }
        }
    }
    void bookRoom(String name, String category) {
        for(Room room : rooms) {
            if(room.category.equalsIgnoreCase(category) && room.isAvailable){
                room.isAvailable = false;
                saveBooking(new Reservation(name, room.roomNumber,category));
                System.out.println("Room booked successfully!");
                return;
            }
        }
        System.out.println("No rooms available in this category.");
    }
    void cancelBooking(int roomNumber) {
        for(Room room : rooms) {
            if(room.roomNumber == roomNumber && !room.isAvailable){
                room.isAvailable = true;
                System.out.println("Booking cancelled successfully!");
                return;
            }
        }
        System.out.println("Invalid room number.");
    }
    void saveBooking(Reservation reservation) {
        try {
            FileWriter fw = new FileWriter("bookings.txt",true);
            fw.write(reservation.toString() + "\n");
            fw.close();
        } catch(IOException e) {
            System.out.println("Error saving booking.");
        }
    }
}
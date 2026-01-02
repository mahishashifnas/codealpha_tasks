public class Reservation {
    String customerName;
    int roomNumber;
    String category;

    Reservation(String customerName,int roomNumber,String category) {
        this.customerName = customerName;
        this.roomNumber = roomNumber;
        this.category = category;
    }
    public String toString() {
        return customerName + "," + roomNumber + "," + category; 
    }
}
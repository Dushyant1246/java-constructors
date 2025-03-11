public class HotelBooking {
    // Fields
    private String guestName;
    private String roomType;
    private int nights;

    // Default Constructor
    HotelBooking(){
        this.guestName = "";
        this.roomType = "";
        this.nights = 0;
    }

    // Copy Constructor
    HotelBooking(HotelBooking hotelBooking){
        this.guestName = hotelBooking.guestName;
        this.roomType = hotelBooking.roomType;
        this.nights = hotelBooking.nights;
    }

    // Parameterized Constructor
    HotelBooking(String guestName, String roomType, int nights){
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Getters and Setters
    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public void displayBooking(){
        System.out.println("Guest Name: " + this.getGuestName() + "\nRoom Type: " + this.getRoomType() + "\nNights: " + this.getNights());
    }
}
/*
HotelBooking hotelBooking1 = new HotelBooking();
HotelBooking hotelBooking2 = new HotelBooking("Dushyant", "A23", 2);
HotelBooking hotelBooking3 = new HotelBooking(hotelBooking2);
hotelBooking1.displayBooking();
hotelBooking2.displayBooking();
hotelBooking3.displayBooking();

Guest Name:
Room Type:
Nights: 0
Guest Name: Dushyant
Room Type: A23
Nights: 2
Guest Name: Dushyant
Room Type: A23
Nights: 2
 */
public class HomeStay1 {
     int id;
     String location;
     String ownerName;
     String checkInDate;
     String checkOutDate;

    public boolean addHomeStayDetails(int id, String location, String ownerName, String checkInDate, String checkOutDate) {
        boolean isHomeStayAdded = false;
        if (id > 0 && location != null && ownerName != null && checkInDate != null && checkOutDate != null) {
            this.id = id;
            this.location = location;
            this.ownerName = ownerName;
            this.checkInDate = checkInDate;
            this.checkOutDate = checkOutDate;
            isHomeStayAdded = true;
        }
        return isHomeStayAdded;
    }

    public void displayHomeStayInfo() {
        System.out.println("HomeStay ID: " + this.id);
        System.out.println("Location: " + this.location);
        System.out.println("Owner Name: " + this.ownerName);
        System.out.println("Check-In Date: " + this.checkInDate);
        System.out.println("Check-Out Date: " + this.checkOutDate);
    }
}

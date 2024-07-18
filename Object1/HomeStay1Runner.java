public class HomeStay1Runner {
    public static void main(String[] args) {
        HomeStay1 ref = new HomeStay1();
        
        int id = 201;
        String location = "Beachside";
        String ownerName = "John Doe";
        String checkInDate = "2024-08-01";
        String checkOutDate = "2024-08-10";

        boolean isHomeStayAdded = ref.addHomeStayDetails(id, location, ownerName, checkInDate, checkOutDate);
        
        if (isHomeStayAdded) {
            System.out.println("HomeStay added successfully.");
            ref.displayHomeStayInfo();
        } else {
            System.out.println("Failed to add HomeStay. Please check the input values.");
        }
    }
}

public class AmusementPark1Runner {
    public static void main(String[] args) {
        AmusementPark1 ref = new AmusementPark1();
        
        int id = 401;
        String name = "Wonderland";
        String location = "Uptown";
        String openingDate = "2024-06-01";
        String closingDate = "2024-09-30";

        boolean isAmusementParkAdded = ref.addAmusementParkDetails(id, name, location, openingDate, closingDate);
        
        if (isAmusementParkAdded) {
            System.out.println("Amusement Park added successfully.");
            ref.displayAmusementParkInfo();
        } else {
            System.out.println("Failed to add amusement park. Please check the input values.");
        }
    }
}

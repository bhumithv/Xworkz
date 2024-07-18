public class Garden1Runner {
    public static void main(String[] args) {
        Garden1 ref = new Garden1();
        
        int id = 301;
        String name = "Central Park";
        String location = "Downtown";
        int area = 5000;

        boolean isGardenAdded = ref.addGardenDetails(id, name, location, area);
        
        if (isGardenAdded) {
            System.out.println("Garden added successfully.");
            ref.displayGardenInfo();
        } else {
            System.out.println("Failed to add garden. Please check the input values.");
        }
    }
}

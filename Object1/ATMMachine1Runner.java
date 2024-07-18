public class ATMMachine1Runner {
    public static void main(String[] args) {
        ATMMachine1 ref = new ATMMachine1();
        
        int id = 501;
        String location = "City Center";
        String bankName = "National Bank";
        boolean isOperational = true;
        double cashAvailable = 10000.0;

        boolean isATMMachineAdded = ref.addATMMachineDetails(id, location, bankName, isOperational, cashAvailable);
        
        if (isATMMachineAdded) {
            System.out.println("ATM Machine added successfully.");
            ref.displayATMMachineInfo();
        } else {
            System.out.println("Failed to add ATM Machine. Please check the input values.");
        }
    }
}

public class ATMMachine1 {
    private int id;
    private String location;
    private String bankName;
    private boolean isOperational;
    private double cashAvailable; // in currency units

    public boolean addATMMachineDetails(int id, String location, String bankName, boolean isOperational, double cashAvailable) {
        boolean isATMMachineAdded = false;
        if (id > 0 && location != null && bankName != null && cashAvailable >= 0) {
            this.id = id;
            this.location = location;
            this.bankName = bankName;
            this.isOperational = isOperational;
            this.cashAvailable = cashAvailable;
            isATMMachineAdded = true;
        }
        return isATMMachineAdded;
    }

    public void displayATMMachineInfo() {
        System.out.println("ATM Machine ID: " + this.id);
        System.out.println("Location: " + this.location);
        System.out.println("Bank Name: " + this.bankName);
        System.out.println("Is Operational: " + this.isOperational);
        System.out.println("Cash Available: " + this.cashAvailable);
    }
}

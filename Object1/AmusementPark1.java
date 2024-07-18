public class AmusementPark1 {
    private int id;
    private String name;
    private String location;
    private String openingDate;
    private String closingDate;

    public boolean addAmusementParkDetails(int id, String name, String location, String openingDate, String closingDate) {
        boolean isAmusementParkAdded = false;
        if (id > 0 && name != null && location != null && openingDate != null && closingDate != null) {
            this.id = id;
            this.name = name;
            this.location = location;
            this.openingDate = openingDate;
            this.closingDate = closingDate;
            isAmusementParkAdded = true;
        }
        return isAmusementParkAdded;
    }

    public void displayAmusementParkInfo() {
        System.out.println("Amusement Park ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Location: " + this.location);
        System.out.println("Opening Date: " + this.openingDate);
        System.out.println("Closing Date: " + this.closingDate);
    }
}

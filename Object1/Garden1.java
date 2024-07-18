public class Garden1 {
    private int id;
    private String name;
    private String location;
    private int area; // in square meters

    public boolean addGardenDetails(int id, String name, String location, int area) {
        boolean isGardenAdded = false;
        if (id > 0 && name != null && location != null && area > 0) {
            this.id = id;
            this.name = name;
            this.location = location;
            this.area = area;
            isGardenAdded = true;
        }
        return isGardenAdded;
    }

    public void displayGardenInfo() {
        System.out.println("Garden ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Location: " + this.location);
        System.out.println("Area: " + this.area + " square meters");
    }
}

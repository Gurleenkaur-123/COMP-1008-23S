package Assignment01;

public class House {
    private String address;
    public int numberOfRooms;
    protected boolean hasGarden;

    // Default constructor
    public House() {
    }

    // Constructor with address parameter
    public House(String address) {
        this.address = address;
    }

    // Constructor with numberOfRooms parameter
    public House(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    // Constructor with hasGarden parameter
    public House(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    // Constructor with address and numberOfRooms parameters
    public House(String address, int numberOfRooms) {
        this.address = address;
        this.numberOfRooms = numberOfRooms;
    }

    // Constructor with address and hasGarden parameters
    public House(String address, boolean hasGarden) {
        this.address = address;
        this.hasGarden = hasGarden;
    }

    // Constructor with numberOfRooms and hasGarden parameters
    public House(int numberOfRooms, boolean hasGarden) {
        this.numberOfRooms = numberOfRooms;
        this.hasGarden = hasGarden;
    }

    // Getters and Setters
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public boolean hasGarden() {
        return hasGarden;
    }

    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }
}

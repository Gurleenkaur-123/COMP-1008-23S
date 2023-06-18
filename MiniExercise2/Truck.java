package MiniExercise2;

public class Truck extends Vehicle {
    protected int seats;
    protected double trunkSpace;

    // Default constructor
    public Truck() {
    }

    // Constructors mirroring the constructors of the Vehicle class
    public Truck(String color, int numberOfDoors, boolean gasPowered) {
        super(color, numberOfDoors, gasPowered);
    }

    public Truck(String color, boolean gasPowered) {
        super(color, gasPowered);
    }

    public Truck(String color, int numberOfDoors) {
        super(color, numberOfDoors);
    }

    public Truck(String color) {
        super(color);
    }

    // Constructor with 3 instance variables of Vehicle and seats instance variable of Truck
    public Truck(String color, int numberOfDoors, boolean gasPowered, int seats) {
        super(color, numberOfDoors, gasPowered);
        this.seats = seats;
    }

    // Constructor with 3 instance variables of Vehicle and trunk space instance variable of Truck
    public Truck(String color, int numberOfDoors, boolean gasPowered, double trunkSpace) {
        super(color, numberOfDoors, gasPowered);
        this.trunkSpace = trunkSpace;
    }

    // Constructor with 3 instance variables of Vehicle and both instance variables of Truck
    public Truck(String color, int numberOfDoors, boolean gasPowered, int seats, double trunkSpace) {
        super(color, numberOfDoors, gasPowered);
        this.seats = seats;
        this.trunkSpace = trunkSpace;
    }

    // Override the toString method to summarize all instance variables
    @Override
    public String toString() {
        return "Truck{" +
                "color='" + getColor() + '\'' +
                ", numberOfDoors=" + getNumberOfDoors() +
                ", gasPowered=" + isGasPowered() +
                ", seats=" + seats +
                ", trunkSpace=" + trunkSpace +
                '}';
    }

    // Override the isEcoFriendly method
    @Override
    public boolean isEcoFriendly() {
        return super.isEcoFriendly() && seats <= 2 && trunkSpace == 0;
    }
}



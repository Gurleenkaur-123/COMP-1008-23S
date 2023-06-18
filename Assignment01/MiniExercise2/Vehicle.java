package MiniExercise2;

public class Vehicle {
    private String color;
    private int numberOfDoors;
    private boolean gasPowered;

    // Default constructor
    public Vehicle() {
    }

    // Constructor with parameters for all instance variables
    public Vehicle(String color, int numberOfDoors, boolean gasPowered) {
        this.color = color;
        this.numberOfDoors = numberOfDoors;
        this.gasPowered = gasPowered;
    }

    // Constructor with parameters for color and gasPowered, using a default value for numberOfDoors
    public Vehicle(String color, boolean gasPowered) {
        this.color = color;
        this.gasPowered = gasPowered;
        // Default value for numberOfDoors is set to 4
        this.numberOfDoors = 4;
    }

    // Constructor with parameters for color and numberOfDoors, using a default value for gasPowered
    public Vehicle(String color, int numberOfDoors) {
        this.color = color;
        this.numberOfDoors = numberOfDoors;
        // Default value for gasPowered is set to true
        this.gasPowered = true;
    }

    // Constructor with parameter for color, using default values for numberOfDoors and gasPowered
    public Vehicle(String color) {
        this.color = color;
        // Default value for numberOfDoors is set to 4
        this.numberOfDoors = 4;
        // Default value for gasPowered is set to true
        this.gasPowered = true;
    }

    // Getters and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public boolean isGasPowered() {
        return gasPowered;
    }

    public void setGasPowered(boolean gasPowered) {
        this.gasPowered = gasPowered;
    }

    // Override the toString method
    @Override
    public String toString() {
        return "Vehicle{" +
                "color='" + color + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                ", gasPowered=" + gasPowered +
                '}';
    }

    // Method to check if the Vehicle is eco-friendly
    public boolean isEcoFriendly() {
        return numberOfDoors == 2 && !gasPowered;
    }
}

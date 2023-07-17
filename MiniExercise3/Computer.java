package MiniExercise3;

import MiniExercise3.Button;

public class Computer extends Keyboard implements Button {
    private String operatingSystem;

    public Computer(String brand, int numberOfKeys, String operatingSystem) {
        super(brand, numberOfKeys);
        this.operatingSystem = operatingSystem;
    }

    @Override
    public void pressKey(char key) {
        System.out.println("Key " + key + " is pressed on the keyboard.");
    }

    @Override
    public void cleanKeyboard() {
        System.out.println("Cleaning the keyboard of the computer.");
    }

    @Override
    public void onClick() {
        System.out.println("Button on the computer is clicked.");
    }

    @Override
    public String getLabel() {
        return "Power";
    }

    // Additional methods specific to the Computer class
    public void bootUp() {
        System.out.println("The computer is booting up.");
    }

    public void shutDown() {
        System.out.println("The computer is shutting down.");
    }
}

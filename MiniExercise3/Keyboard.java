package MiniExercise3;

public abstract class Keyboard {
    // Instance variables
    protected String brand;
    protected int numberOfKeys;

    // Concrete methods
    public void turnOn() {
        System.out.println("The keyboard is turned on.");
    }

    public void turnOff() {
        System.out.println("The keyboard is turned off.");
    }

    // Abstract methods
    public abstract void pressKey(char key);

    public abstract void cleanKeyboard();

    // Constructor
    public Keyboard(String brand, int numberOfKeys) {
        this.brand = brand;
        this.numberOfKeys = numberOfKeys;
    }
}

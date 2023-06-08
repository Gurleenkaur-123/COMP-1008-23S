package Assignment01;

import Assignment01.House;

public class HouseRunner {
    public static void main(String[] args) {
        // Instantiate the House object using different constructors
        House house1 = new House();
        House house2 = new House("123 Main Street");
        House house3 = new House(4, true);

        // Output the values of the instance variables using printf()
        System.out.printf("House 1: Address = %s, Number of Rooms = %d, Has Garden = %b%n",
                house1.getAddress(), house1.getNumberOfRooms(), house1.hasGarden());

        System.out.printf("House 2: Address = %s, Number of Rooms = %d, Has Garden = %b%n",
                house2.getAddress(), house2.getNumberOfRooms(), house2.hasGarden());

        System.out.printf("House 3: Address = %s, Number of Rooms = %d, Has Garden = %b%n",
                house3.getAddress(), house3.getNumberOfRooms(), house3.hasGarden());
    }
}

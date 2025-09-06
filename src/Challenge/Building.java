package Challenge;
//25. Write a Java program to create a class called "Building" with attributes
//for address, number of floors, and total area. Create subclasses "ResidentialBuilding"
//and "CommercialBuilding" that add specific attributes like number of apartments for
//residential and office space for commercial buildings. Implement a method to
//calculate the total rent for each subclass.
public class Building {
    String address;
    int numberOfFloors, totalArea;

    class ResidentialBuilding {
        int numberOfApartments;

        public void totalRent() {}
    }

    class CommercialBuilding {
        int officeSpace;

        public void totalRent() {}
    }
}

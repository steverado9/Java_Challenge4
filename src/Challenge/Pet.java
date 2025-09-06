package Challenge;
//29. Write a Java program to create a class called "Pet" with attributes for name,
//species, and age. Create subclasses "Dog" and "Bird" that add specific attributes
//like favorite toy for dogs and wing span for birds. Implement methods to display
//pet details and calculate the pet's age in human years.
public class Pet {
    String name, species;
    int age;

    class Dog {
        String favoriteToy;
    }

    class Bird {
        String  wingSpan;
    }

    public void petDetails() {}

    public void calPetAge() {}

}

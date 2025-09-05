package Challenge;

//Write a Java program to create a class called "Dog" with a name and breed attribute.
// Create two instances of the "Dog" class, set their attributes using the
// constructor and modify the attributes using the setter methods and print the updated values.
public class Dog {
    String name, breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void set(String newName, String newBreed) {
        this.name = newName;
        this.breed = newBreed;
        System.out.println("Name: " + this.name + " Breed: " + this.breed);
    }

}

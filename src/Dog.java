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
    }

    public static void main(String[] args) {
        //Instance one
        Dog myObj = new Dog("Lala", "Bingo" );

        //Instance two
        Dog myObj2 = new Dog("nana", "Jingo");

        //Print updated values for instance one
        myObj.set("Joseph", "Lingo");
        System.out.println("Name: " + myObj.name + " Age " + myObj.breed );

        //Print updated values for instance two
        myObj2.set("Stephen", "vingo");
        System.out.println("Name: " + myObj2.name + " Age " + myObj2.breed );
    }
}

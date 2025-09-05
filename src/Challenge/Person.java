package Challenge;

//1. Write a Java program to create a class called "Person" with
//a name and age attribute. Create two instances of the "Person" class,
//set their attributes using the constructor, and print their name and age.
public class Person {
    String name;
    int age;

    public Person(String name, int age ) {
        this.name = name;
        this.age = age;
    }

    public void printName() {
        System.out.println("Name: " + this.name + " Age: " + this.age);
    }
}

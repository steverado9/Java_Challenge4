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

    public static void main(String[] args) {
        //Instance 1
        Person myObj1 = new Person("Stephen", 26);

        //Instance 2
        Person myObj2 = new Person("Aduke", 23);

        //Print attrinutes of first instance
        System.out.println("Name: " + myObj1.name + " Age: " + myObj1.age);

        //Print attributes of second instance
        System.out.println("Name: " + myObj2.name + " Age: " + myObj2.age);
    }
}

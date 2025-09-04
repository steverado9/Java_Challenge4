import java.util.ArrayList;
import java.util.List;

//Write a Java program to create a class called "Student" with a name, grade,
//and courses attributes, and methods to add and remove courses.
public class Student {
    //Main method
    public static void main(String[] args) {
        //create an student object
        Student courses = new Student();
        //call the add method with courses object
        courses.add("Maths");

        //removing Math from list
        courses.remove("Maths");
    }
    String name;
    char grade;

    List<String> courses = new ArrayList<>();

    public void add (String value) {
        courses.add(value);
        System.out.println("List of courses: " + courses);
    }

    public void remove (String value) {
        courses.remove(value);
        System.out.println("List of courses: " + courses);
    }

}

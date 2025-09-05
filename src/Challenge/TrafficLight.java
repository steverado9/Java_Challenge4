package Challenge;

// Write a Java program to create class called "TrafficLight" with attributes
//for color and duration, and methods to change the color and check for red or green.
public class TrafficLight {
    String color;
    int duration;
    public String[] colors = {"red", "yellow", "green"};

    public void changeColor() {
        int number = (int) (Math.random() * 3);
        System.out.println("color: " + colors[number]);
    }

    public void redOrGreen() {
        int number = (int) (Math.random() * 3);
        if (colors[number] == "red" || colors[number] == "green") {
            System.out.println("Check for red or green: " + colors[number]);
        }
    }
}

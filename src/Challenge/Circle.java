package Challenge;

// Write a Java program to create a class called "Circle" with a radius attribute.
// You can access and modify this attribute. Calculate the area and circumference of the circle.
public class Circle {
    int radius ;

    public int get() {
        return this.radius;
    }

    public int set(int newRadius) {
        this.radius = newRadius;
        return this.radius;
    }

    public int area(int radius) {
        this.radius = radius;
        int result = (int) (3.142 * this.radius * this.radius);
        System.out.println("The Area is : " + result);
        return result;
    };

    public int circumference(int radius) {
        this.radius = radius;
        int result = (int) (2 * 3.142 * this.radius);
        System.out.println("The circumference is : " + result);
        return result;
    };
}

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
        return result;
    };

    public int circumference(int radius) {
        this.radius = radius;
        int result = (int) (2 * 3.142 * this.radius);
        return result;
    };

    public static void main(String[] args) {
        Circle myObj = new Circle();
        int circumference =  myObj.circumference(7);
        int area = myObj.area(7);

        System.out.println("The circumference is : " + circumference);
        System.out.println("The Area is : " + area);

    }
}

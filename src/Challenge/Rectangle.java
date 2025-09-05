package Challenge;

//3. Write a Java program to create a class called "Rectangle"
// with width and height attributes.
// 2 methods to calculate the area and perimeter of the rectangle.
public class Rectangle {
    //width and length attribute
    int width, length;

    //Method to calculate area of rectangle
    public int area(int width, int length) {
        this.width = width;
        this.length = length;

        int result = this.width * this.length;

        System.out.println("Area: " + result);
        return result;
    }

    //method to calculate perimeter
    public int perimeter(int width, int length) {
        this.width = width;
        this.length = length;
        int result = 2 * (this.width  +  this.length) ;

        System.out.println("Perimeter: " + result);
        return result ;
    }

    public static class MusicLibrary {
    }
}

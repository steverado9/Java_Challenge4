//3. Write a Java program to create a class called "Rectangle"
// with width and height attributes.
// 2 methods to calculate the area and perimeter of the rectangle.
public class Rectangle {
    public static void main(String[] args) {
        //create an instance of the class Rectangle
        Rectangle obj = new Rectangle();

        //call both methods and put them in a variable
        int area = obj.area(5, 7);
        int perimeter = obj.perimeter(5, 7);

        //Pint the area and perimeter of the rectangle
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
    //width and length attribute
    int width, length;

    //Method to calculate area of rectangle
    public int area(int width, int length) {
        this.width = width;
        this.length = length;

        int result = this.width * this.length;
        return result;
    }

    //method to calculate perimeter
    public int perimeter(int width, int length) {
        this.width = width;
        this.length = length;
        int result = 2 * (this.width  +  this.length) ;
        return result ;
    }

}

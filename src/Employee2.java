//Write a Java program to create a class called "Employee" with a name,
//salary, and hire date attributes, and a method to calculate years of service.
public class Employee2 {
    String name;
    int salary, hireDate;
    public void yearsOfService(int hireDate, int terminationDate) {
         this.hireDate = hireDate;
         int result = terminationDate - this.hireDate;
        System.out.println("year of service: " + result + "years");
    }

    //Main driver method
    public static void main(String[] args) {
        //instance of the employee class
        Employee2 stephen = new Employee2();
        stephen.yearsOfService(2022, 2025 );
    }
}

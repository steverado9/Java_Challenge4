//6. Write a Java program to create a class called "Employee" with a name,
//job title, and salary attributes, and methods to calculate and update salary.
public class Employee {
    public static void main(String[] args) {
        Employee stephen = new Employee();
        int stephenSalary = stephen.calculateSalaray(20);
        System.out.println("Stephen's salary is: " + stephenSalary);
    }
    String jobTitle, name;
    int salary;

    public int calculateSalaray (int days) {
        int amountInDollars = 20;
        int timeInHours = 9;
        int result = amountInDollars * timeInHours * days;
        this.salary = result;
        return this.salary;
    }

    public int set(int salary) {
        this.salary = salary;
        return this.salary;
    }
}

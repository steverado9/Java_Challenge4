package Test;
import Challenge.*;


public class Class {
    public static void main(String[] args) {
        //Challenge 1
        //Instance 1
        Person person1 = new Person("Stephen", 26);
        person1.printName();
        //Instance 2
        Person person2 = new Person("Aduke", 23);
        person2.printName();

        //Challenge 2
        //Instance one
        Dog dog1 = new Dog("Lala", "Bingo" );
        //Print updated values for instance one
        dog1.set("Joseph", "Lingo");
        //Instance two
        Dog dog2 = new Dog("nana", "Jingo");
        //Print updated values for instance two
        dog2.set("Stephen", "vingo");

        //CHallenge 3
        //create an instance of the class Rectangle
        Rectangle rectangle = new Rectangle();
        //call both methods and put them in a variable
        rectangle.area(5, 7);
        rectangle.perimeter(5, 7);

        //Challenge 4
        Circle circle = new Circle();
        circle.circumference(7);
        circle.area(7);

        //challenge 5
        //Intance of Book to call the Book methods
        Book book = new Book();
        book.add("one");
        book.remove("one");

        //challenge 6
        Employee stephen = new Employee();
        stephen.calculateSalaray(20);

        //challenge 7
        //Intance of Bank to call the Bank methods
        Bank account = new Bank();
        account.add(1);
        account.remove(1);

        //challenge 8
        TrafficLight tl = new TrafficLight();
        tl.changeColor();
        tl.changeColor();
        tl.redOrGreen();

        //challenge 9
        //instance of the employee class
        Employee2 employee2 = new Employee2();
        employee2.yearsOfService(2022, 2025 );

        //challenge 10
        //create a student object
        Student courses = new Student();
        //call the add method with courses object
        courses.add("Maths");
        //removing Math from list
        courses.remove("Maths");

        //challenge11
        Library books = new Library();
        //Method to add book
        books.add("one");
        //Method to remove book
        books.remove("one");

        //Challenge12
        Airplane airplane = new Airplane();
        airplane.checkFlightStatus();

        //Challenge13
        Inventory inventory = new Inventory();
        inventory.add("stephen");
        inventory.remove("stephen");
        inventory.checkForLowInventory();

        //challenge14

        //challenge15

        //challenge 16

        //challenge 17
        Movie movie = new Movie();
        movie.addReview("name");
        movie.retrieveReview("name");

        //challenge 18
        Restaurant restaurant = new Restaurant();
        restaurant.addItems("amen");
        restaurant.averageRating();

        //challenge 19

        //challenge 20
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposite(100);
        bankAccount.withdraw(5);
        bankAccount.checkBalance();

    }
}

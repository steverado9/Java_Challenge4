package Challenge;
//20. Write a Java program to create a class called "BankAccount"
//with attributes for account number, account holder's name, and balance.
//Include methods for depositing and withdrawing money, as well as checking the balance.
//Create a subclass called "SavingsAccount" that adds an interest rate attribute
//and a method to apply interest.
public class BankAccount {
    int accountNumber;
    String accountName;
    int balance = 0;

    public void deposite(int value) {
        balance = balance + value;
        System.out.println("You deposited " + value + " and your balance is " + balance);
    }

    public void withdraw(int value) {
        if (value > balance) {
            System.out.println("Insufficient funds");
        }
        balance = balance - value;
        System.out.println("widthraw: " + value + " and balance is : " + balance);

    }

    public void checkBalance() {
        System.out.println("Your balance is: " + balance);
    }

    class SavingsAccount {
        int interestRate;

        public void applyInterest(int value) {
            System.out.println("you have applied interest");
        }
    }
}

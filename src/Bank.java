import java.util.ArrayList;
import java.util.Collection;
import java.util.PriorityQueue;

//Write a Java program to create a class called "Bank" with a collection of accounts
// and methods to add and remove accounts, and to deposit and withdraw money.
// Also define a class called "Account" to maintain account details of a particular customer.
public class Bank {
    public static void main(String[] args) {
        Bank account = new Bank();
        account.add(1);
        account.remove(1);
    }
    Collection<Integer> accounts = new PriorityQueue<>();
    int amount = 100;

    public void add( int value) {
        accounts.add(value);
        System.out.println(accounts);
    }

    public void remove(int value) {
        accounts.remove(value);
        System.out.println(accounts);
    }

    public void deposite(int value) {
        this.amount = this.amount + value;
        System.out.println("Your account balance is : " + this.amount);
    }

    public void withdraw(int value) {
        this.amount = this.amount - value;
        System.out.println("Your account balance is : " + this.amount);
    }
}

class Account {
    Bank account1 = new Bank();
    String name = "Stephen";
    int AccountNumber = 1;
    int Amount = account1.amount;
}

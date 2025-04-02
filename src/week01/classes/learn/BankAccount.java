package week01.classes.learn;

import week01.oops_advanced.practice.solutions.exceptions.InsufficientFundsException;

/**
 * A class BankAccount with fields accountNumber, balance
 * Methods -> deposit(), withdraw(), getBalance()
 * A method displayDetails() to print account info.
 * A static field totalAccounts to track how many accounts exist.
 */

public class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;
    public static int totalAccounts = 0;

    public BankAccount(double balance, String accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = name;
        totalAccounts++;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
        this.displayDetails();
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > this.balance) {
            throw new InsufficientFundsException("Insufficient funds");
        } else {
            this.balance -= amount;
        }
    }

    public void displayDetails() {
        System.out.println("Account Number: " + this.accountNumber + "\nBalance: " + this.balance);
    }

    public void printTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }
}

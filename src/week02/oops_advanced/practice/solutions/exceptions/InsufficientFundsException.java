package week02.oops_advanced.practice.solutions.exceptions;

/**
 * Update week01.classes.learn.BankAccount
 * Create InsufficientFundsException
 * Use in BankAccount.withdraw() when balance < amount
 */

public class InsufficientFundsException extends Exception {

    public InsufficientFundsException(String message) {
        super(message);
    }
}

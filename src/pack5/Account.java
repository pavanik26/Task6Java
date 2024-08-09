package pack5;

public class Account {
	    // Data members
	    private String accountNumber;
	    private double balance;

	    // Constructor with no arguments (default constructor)
	    public Account() {
	        this.accountNumber = "00000000";  // Default account number
	        this.balance = 0.0;  // Default balance
	    }

	    // Constructor with arguments to initialize account number and balance
	    public Account(String accountNumber, double balance) {
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	    }

	    // Method to withdraw from account
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawal successful. New balance: " + balance);
	        } else {
	            System.out.println("Withdrawal failed. Insufficient funds.");
	        }
	    }

	    // Method to deposit into account
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposit successful. New balance: " + balance);
	        } else {
	            System.out.println("Deposit failed. Invalid amount.");
	        }
	    }

	    // Method to check balance
	    public double checkBalance() {
	        return balance;
	    }

	    // Main method (for testing)
	    public static void main(String[] args) {
	        // Create an instance of Account using default constructor
	        Account account1 = new Account();
	        System.out.println("Account 1 - Account Number: " + account1.accountNumber);
	        System.out.println("Account 1 - Balance: " + account1.checkBalance());

	        // Create an instance of Account using constructor with arguments
	        Account account2 = new Account("12345678", 1000.0);
	        System.out.println("Account 2 - Account Number: " + account2.accountNumber);
	        System.out.println("Account 2 - Balance: " + account2.checkBalance());

	        // Perform operations on account2
	        account2.deposit(500.0);
	        account2.withdraw(200.0);
	    }
	}



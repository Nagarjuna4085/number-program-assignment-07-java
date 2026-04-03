package javaprograms;

public abstract class Account {

	private String accountNumber;
	private int pin;
	protected double balance;

	// setter
	public Account(String accountNumber, int pin, double balance) {
		this.accountNumber = accountNumber;
		this.pin = pin;
		this.balance = balance;

	}

	// getter

	// 

	public double getBalance() {
        return this.balance;
    }
//	public double getBalance(int pin) {
//
//		if (this.pin == pin) {
//			return this.balance;
//		}
//		return -1.0;
//	}
	
	public boolean validatePin(int inputPin) {
        return this.pin == inputPin;
    }

	// deposit

	public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited: ₹" + amount);
        }
    }

	// withdraw

	// Abstract method: Every account must implement its own withdrawal logic
    public abstract boolean withdraw(double amount);

	public static void main(String[] args) {

	}
}

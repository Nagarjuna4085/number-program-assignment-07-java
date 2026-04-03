package javaprograms;

public class SavingsAccount extends Account implements InterestBearing {
    private double interestRate = 0.04; // 4% Interest

    public SavingsAccount(String accNum, int pin, double bal) {
        super(accNum, pin, bal); // Calls the parent constructor
    }

    public void addInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest added: ₹" + interest);
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
    
    // implement the interface
    @Override
    public void applyInterest() {
    	// TODO Auto-generated method stub
    	double interest = balance * DEFAULT_RATE;
    	System.out.println("Interest of ₹" + interest + " applied to Savings Account.");
    	
    	
    }
}
package javaprograms;

public class CheckingAccount extends Account {
    private double overdraftLimit = 1000.0; // Can go negative up to ₹1000

    public CheckingAccount(String accNum, int pin, double bal) {
        super(accNum, pin, bal);
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && (balance + overdraftLimit) >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
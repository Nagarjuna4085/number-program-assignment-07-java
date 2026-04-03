package javaprograms;

public class ATM {
    // This method is POLYMORPHIC: It doesn't care if it's Savings or Checking
    public static void processTransaction(Account acc, double amount) {
        System.out.println("Processing transaction for Account...");
        if (acc.withdraw(amount)) {
            System.out.println("Success! New Balance: ₹" + acc.getBalance());
        } else {
            System.out.println("Transaction Failed.");
        }
    }

    public static void main(String[] args) {
        // Polymorphic declarations
        Account sa = new SavingsAccount("S101", 1122, 5000);
        Account ca = new CheckingAccount("C202", 3344, 500);
        
     // We can check if an account supports interest at runtime
        if (sa instanceof InterestBearing) {
            ((InterestBearing) sa).applyInterest(); // Cast and call
        }

        if (ca instanceof InterestBearing) {
            ((InterestBearing) ca).applyInterest();
        } else {
            System.out.println("This account type does not earn interest.");
        }
        // Even though 'sa' and 'ca' are declared as 'Account', 
        // Java calls the specific withdraw() method for each at runtime.
        
        System.out.println("--- Savings Transaction ---");
        processTransaction(sa, 2000);

        System.out.println("\n--- Checking Transaction (Overdraft) ---");
        processTransaction(ca, 1200); // This works because of the ₹1000 limit!
    }
}
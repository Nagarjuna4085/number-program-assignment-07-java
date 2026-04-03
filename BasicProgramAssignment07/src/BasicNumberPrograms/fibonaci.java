package BasicNumberPrograms;

public class fibonaci {
    public static void main(String[] args) {
        int n = 15;   // The limit
        int n1 = 0;   // First number
        int n2 = 1;   // Second number

        System.out.println("Fibonacci Series up to " + n + ":");
        
        // Print the starting numbers first
        System.out.print(n1 + " " + n2 + " ");

        // Loop to find the rest
        while ((n1 + n2) <= n) {
            int n3 = n1 + n2;
            System.out.print(n3 + " ");
            
            // The "Shift" Logic
            n1 = n2; 
            n2 = n3;
        }
    }
}
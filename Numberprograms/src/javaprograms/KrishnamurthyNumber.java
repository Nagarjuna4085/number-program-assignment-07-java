package javaprograms;

import java.util.Scanner;

public class KrishnamurthyNumber {
    
    // Helper method to find factorial of a digit
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int temp = num;
        int sum = 0;

        // Step 1: Extract digits
        while (temp > 0) {
            int digit = temp % 10;
            
            // Step 2: Sum the factorials
            sum += factorial(digit);
            
            temp /= 10;
        }

        // Step 3: Compare
        if (sum == num) {
            System.out.println(num + " is a Krishnamurthy Number.");
        } else {
            System.out.println(num + " is NOT a Krishnamurthy Number.");
        }
    }
}
package javaprograms;

import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        int temp = n;
        int sum = 0;
        int product = 1; // Initialize product to 1
        
        while (temp > 0) {
            int digit = temp % 10; // Get the last digit
            
            sum += digit;          // Add to sum
            product *= digit;      // Multiply to product
            
            temp /= 10;            // Remove the last digit
        }
        
        if (sum == product) {
            System.out.println(n + " is a Spy Number.");
        } else {
            System.out.println(n + " is not a Spy Number.");
        }
        
        sc.close();
    }
}
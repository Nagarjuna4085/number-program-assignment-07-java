package javaprograms;

import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        int square = n * n;
        int sum = 0;
        
        // Sum the digits of the square
        while (square > 0) {
            sum += square % 10; // Get last digit
            square /= 10;       // Remove last digit
        }
        
        if (sum == n) {
            System.out.println(n + " is a Neon Number.");
        } else {
            System.out.println(n + " is not a Neon Number.");
        }
        sc.close();
    }
}
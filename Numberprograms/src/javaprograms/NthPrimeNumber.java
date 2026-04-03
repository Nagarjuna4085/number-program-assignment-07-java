package javaprograms;

import java.util.Scanner;

public class NthPrimeNumber {

    // Method to check if a number is prime (The "Security Guard")
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        
        // Efficiency trick: only check up to the square root of n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Found a divisor, so it's not prime
            }
        }
        return true; // No divisors found, it is prime
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int count = 0;   // How many primes we have found so far
        int currentNum = 1; // The number we are currently testing

        // Keep looping until our counter reaches the target 'n'
        while (count < n) {
            currentNum++; // Move to the next number (starts at 2)
            
            if (isPrime(currentNum)) {
                count++; // We found one! Increment the tally
            }
        }

        // Once the loop breaks, 'currentNum' is the nth prime
        System.out.println("The " + n + "th prime number is: " + currentNum);
        
        sc.close();
    }
}
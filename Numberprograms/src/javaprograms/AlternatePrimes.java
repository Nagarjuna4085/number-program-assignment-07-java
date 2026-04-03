package javaprograms;

import java.util.Scanner;

public class AlternatePrimes {

    // Helper: Same efficient prime check we used before
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit to search for primes: ");
        int limit = sc.nextInt();

        int primeCounter = 0; // Tracks how many primes we've found in total
        
        System.out.println("Alternate Prime Numbers up to " + limit + ":");

        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                // If primeCounter is even (0, 2, 4...), print the prime
                // If primeCounter is odd (1, 3, 5...), skip the prime
                if (primeCounter % 2 == 0) {
                    System.out.print(i + " ");
                }
                
                // Always increment the counter when a prime is found
                primeCounter++;
            }
        }
        sc.close();
    }
}
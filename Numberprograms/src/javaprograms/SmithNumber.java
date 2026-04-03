package javaprograms;

import java.util.Scanner;

public class SmithNumber {

    // Helper: Sum of digits of any number (e.g., 37 -> 10)
    public static int getDigitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    // Helper: Check if number is prime (Smith numbers must be composite)
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPrime(n)) {
            System.out.println(n + " is Prime, so it's NOT a Smith Number.");
            return;
        }

        int originalDigitSum = getDigitSum(n);
        int primeFactorsDigitSum = 0;
        int temp = n;

        // Find prime factors
        for (int i = 2; i <= temp; i++) {
            while (temp % i == 0) {
                // We sum the digits of the factor i
                // (e.g., if factor is 37, we add 3+7)
                primeFactorsDigitSum += getDigitSum(i);
                temp /= i;
            }
        }

        if (originalDigitSum == primeFactorsDigitSum) {
            System.out.println(n + " is a Smith Number.");
        } else {
            System.out.println(n + " is NOT a Smith Number.");
        }
    }
}
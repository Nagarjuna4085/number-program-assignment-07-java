package javaprograms;

import java.util.Scanner;

public class MysteryNumber {

    // Helper method to reverse a number
    public static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean found = false;

        // We only need to go up to n/2 because i + reverse(i) is symmetric
        for (int i = 1; i <= n / 2; i++) {
            int j = reverse(i);
            
            if (i + j == n) {
                System.out.println(n + " is a Mystery Number because: " + i + " + " + j);
                found = true;
                break; // We found it, no need to keep looking
            }
        }

        if (!found) {
            System.out.println(n + " is NOT a Mystery Number.");
        }
    }
}
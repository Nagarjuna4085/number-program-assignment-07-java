package javaprograms;

import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String s = sc.next(); // Read as String to preserve leading zeros

        boolean hasZero = false;

        // Rule 1: A Duck number cannot start with 0
        if (s.charAt(0) == '0') {
            System.out.println("Not a Duck Number");
            return;
        }

        // Rule 2: Look for a zero in the rest of the digits
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                hasZero = true;
                break;
            }
        }

        if (hasZero) {
            System.out.println(s + " is a Duck Number");
        } else {
            System.out.println(s + " is NOT a Duck Number");
        }
    }
}
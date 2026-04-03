package javaprograms;

import java.util.Scanner;

public class ISBNValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 10-digit ISBN: ");
        String isbn = sc.next();

        if (isbn.length() != 10) {
            System.out.println("Invalid Length");
            return;
        }

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            char c = isbn.charAt(i);
            int digit;

            // Handle the 'X' case for the last digit
            if (i == 9 && c == 'X') {
                digit = 10;
            } else {
                digit = Character.getNumericValue(c);
            }

            // Multiply digit by weight (10 down to 1)
            sum += (digit * (10 - i));
        }

        if (sum % 11 == 0) {
            System.out.println("Valid ISBN-10");
        } else {
            System.out.println("Invalid ISBN-10");
        }
    }
}
package javaprograms;

import java.util.Scanner;

public class StrontioNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 4-digit number: ");
        int num = sc.nextInt();

        // Check if it is a 4-digit number
        if (num < 1000 || num > 9999) {
            System.out.println("Please enter a valid 4-digit number.");
        } else {
            int result = num * 2;
            
            // Extract hundreds digit: (e.g., 2772 -> 27 -> 7)
            int hundreds = (result / 100) % 10;
            
            // Extract tens digit: (e.g., 2772 -> 277 -> 7)
            int tens = (result / 10) % 10;

            if (hundreds == tens) {
                System.out.println(num + " is a Strontio Number.");
            } else {
                System.out.println(num + " is NOT a Strontio Number.");
            }
        }
    }
}
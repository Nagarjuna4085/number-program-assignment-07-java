package javaprograms;

import java.util.Scanner;

public class XylemPhloem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int temp = Math.abs(num);
        int extremeSum = 0, meanSum = 0;

        // Step 1: Get the last digit (extreme)
        extremeSum += temp % 10;
        temp /= 10;

        // Step 2: Loop through the remaining digits
        while (temp > 9) {
            meanSum += temp % 10; // These are middle (mean) digits
            temp /= 10;
        }

        // Step 3: The last remaining digit is the first digit (extreme)
        extremeSum += temp;

        // Step 4: Compare
        if (extremeSum == meanSum) {
            System.out.println(num + " is a Xylem Number.");
        } else {
            System.out.println(num + " is a Phloem Number.");
        }
    }
}
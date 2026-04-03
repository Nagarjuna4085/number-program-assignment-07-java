package javaprograms;

import java.util.Scanner;

public class PerfectSquareCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num = sc.nextDouble();

        if (num < 0) {
            System.out.println("Negative numbers cannot be perfect squares.");
        } else {
            // 1. Calculate the square root
            double sr = Math.sqrt(num);

            // 2. Check if the remainder when divided by 1 is zero
            if (sr % 1 == 0) {
                System.out.println((int)num + " is a Perfect Square.");
                System.out.println("The root is: " + (int)sr);
            } else {
                System.out.println((int)num + " is NOT a Perfect Square.");
            }
        }

        sc.close();
    }
}
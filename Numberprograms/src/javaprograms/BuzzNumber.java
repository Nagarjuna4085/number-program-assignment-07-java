package javaprograms;

import java.util.Scanner;

public class BuzzNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Logical OR: Only one of these needs to be true
        if (num % 10 == 7 || num % 7 == 0) {
            System.out.println(num + " is a Buzz Number.");
        } else {
            System.out.println(num + " is NOT a Buzz Number.");
        }
    }
}
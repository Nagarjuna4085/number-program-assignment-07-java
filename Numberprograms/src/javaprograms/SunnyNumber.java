package javaprograms;
import java.util.Scanner;

public class SunnyNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int n = sc.nextInt();

        int next = n + 1;

        double sqrt = Math.sqrt(next);

        if (sqrt == (int) sqrt) {
            System.out.println("Sunny number");
        } else {
            System.out.println("Not a Sunny number");
        }

        sc.close();
    }
}
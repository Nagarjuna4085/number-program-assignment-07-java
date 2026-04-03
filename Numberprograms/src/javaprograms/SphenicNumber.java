package javaprograms;

import java.util.*;

public class SphenicNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isSphenic(n)) {
            System.out.println(n + " is a Sphenic Number.");
        } else {
            System.out.println(n + " is NOT a Sphenic Number.");
        }
    }

    public static boolean isSphenic(int n) {
        Set<Integer> primeFactors = new HashSet<>();
        int count = 0;
        int temp = n;

        // Find prime factors
        for (int i = 2; i <= n; i++) {
            // While i divides n, it's a factor
            while (temp % i == 0) {
                primeFactors.add(i);
                temp /= i;
                count++; // Keep track of total factors found
            }
        }

        // Rule: Exactly 3 total factors AND all 3 must be unique (Set size)
        return count == 3 && primeFactors.size() == 3;
    }
}
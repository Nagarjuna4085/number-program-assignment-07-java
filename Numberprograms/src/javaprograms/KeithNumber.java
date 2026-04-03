package javaprograms;

import java.util.ArrayList;
import java.util.Scanner;

public class KeithNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int n = sc.nextInt();
        String s = String.valueOf(n);
        int len = s.length();
        
        ArrayList<Integer> nums = new ArrayList<>();
        int nextSum = 0;

        // 1. Initial Setup: Get the digits and the very first sum
        for (int i = 0; i < len; i++) {
            int digit = s.charAt(i) - '0';
            nums.add(digit);
            nextSum += digit;
        }

        // 2. Optimized Keith Logic
        int i = 0; // Pointer to the "oldest" element that needs to be subtracted
        while (nextSum < n) {
            nums.add(nextSum); // Add the new term to the sequence
            
            // Your logic: The next sum is (Current Sum * 2) - Oldest Term
            int oldestTerm = nums.get(i);
            int tempSum = nextSum + (nextSum - oldestTerm);
            
            nextSum = tempSum;
            i++; // Move the pointer forward
        }

        // 3. Result Check
        if (nextSum == n) {
            System.out.println(n + " is a Keith Number");
        } else {
            System.out.println(n + " is not a Keith Number");
        }
        
        sc.close();
    }
}
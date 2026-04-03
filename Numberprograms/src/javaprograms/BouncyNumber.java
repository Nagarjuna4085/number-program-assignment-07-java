package javaprograms;

public class BouncyNumber {

    // Your "+" logic: Check if it's increasing
    public static boolean isIncreasing(int n) {
        String s = Integer.toString(n);
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) return false;
        }
        return true;
    }

    // Your "-" logic: Check if it's decreasing
    public static boolean isDecreasing(int n) {
        String s = Integer.toString(n);
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) < s.charAt(i + 1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 152; // Example: Bouncy

        // Your "If both false" logic:
        if (!isIncreasing(num) && !isDecreasing(num)) {
            System.out.println(num + " is a Bouncy Number.");
        } else {
            System.out.println(num + " is NOT Bouncy.");
        }
    }
}
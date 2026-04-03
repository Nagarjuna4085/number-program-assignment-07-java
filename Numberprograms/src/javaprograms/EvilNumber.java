package javaprograms;

import java.util.Scanner;

public class EvilNumber {
	public static  String toBinary(int n) {
		String binary = "";
		
		int temp = n;
		while(temp<0) {
			int r = temp%2;
			binary = r +binary;
		}
		
		return binary;
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Step 1 & 2: Count the 1s in the binary form
//        int count = Integer.bitCount(num);
        String getBinary = toBinary(num);
        int sum = 0;
        for(int i=0;i<getBinary.length();i++) {
        	sum+= Character.getNumericValue(getBinary.charAt(i));
        			
        }

        // Step 3: Check if count is even
        if (sum % 2 == 0) {
            System.out.println(num + " is an Evil Number.");
        } else {
            System.out.println(num + " is an Odious Number.");
        }
    }
}
package javaprograms;

import java.util.Scanner;

public class ManualSquareRoot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number to find its square root: ");
		double n = sc.nextDouble();

		// Handle edge cases
		if (n < 0) {
			System.out.println("Cannot find square root of a negative number.");
		} else if (n == 0) {
			System.out.println("Square root is 0");
		} else {
			double highGuess = n / 2;
			for (int i = 0; i < 20; i++) {
				System.out.println(i +"  "+ highGuess);
				double lowGuess = n / highGuess;
				highGuess = (highGuess + lowGuess) / 2;
				
			}
			System.out.println("The Square Root is: " + highGuess);
		}
		
	}

}

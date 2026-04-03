package javaprograms;

import java.util.Scanner;

public class PetersonNumber {
	
	public static int factotial(int n) {
		if(n==0 || n==1) return 1;
		else {
			return n*factotial(n-1);
		}
				
	}
	

	public static void main(String[] args) {
		
	
		
		
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter a number :");
			int input = sc.nextInt();
			int temp = input;
			int sum = 0;
			while(input>0) {
				int r = input%10;
				System.err.println(r);
				sum+= factotial(r);
			    input = input/10;
				
			}
			if(sum == temp) {
			System.out.println("peterson number");
			}else {
				
				System.out.println("not peterson number");
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		} finally {
			sc.close();
		}
	}
}

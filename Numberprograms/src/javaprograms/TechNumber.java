package javaprograms;

import java.util.Scanner;

public class TechNumber {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		try {
			System.out.println("Enter number");
			 long num = sc.nextLong();
			
			
			int i=0;
			long temp = num;
			
			while(temp > 0) {
				long r = temp%10;
				i = i+1;
				temp = temp/10;					
			}
			if(num%2!=0) {
				System.out.println("not a tech number");
				return;
			}
			int divisor = (int) Math.pow(10, i/2);
			long left  =  num/divisor;
			long right  =  num%divisor;
			long total = left+right;
			long squareOfNumber = total*total;
			if(num == squareOfNumber) {
				System.out.println("tech number");
			}else {
				System.out.println("not a tech number");
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}

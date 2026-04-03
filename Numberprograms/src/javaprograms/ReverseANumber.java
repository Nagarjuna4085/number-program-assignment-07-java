package javaprograms;

import java.util.Scanner;

public class ReverseANumber {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 
	 try {
		 System.out.println("Enter a number");
//		 method 1
		 int num = sc.nextInt();
		 Integer temp = num;
//		 567 = 765
		 int s =0;
		 while(num>0) {
			 int r = num%10;
			 s = s*10 + r;
			 num = num/10;
		 }
		 System.out.println(s);
//		 
		 
//		 method1 02
		String reversed = new StringBuilder(temp.toString()).reverse().toString();
		System.out.println(reversed);
		 
		 
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}finally {
		sc.close();
	}
	
}
}

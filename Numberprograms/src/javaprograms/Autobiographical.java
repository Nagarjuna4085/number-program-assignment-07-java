package javaprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Autobiographical {

// 1210
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:---");
		int num = sc.nextInt();
		String s = String.valueOf(num);
		Map<Integer, Integer> fr = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			int digit = Character.getNumericValue(s.charAt(i));
			fr.put(digit, fr.getOrDefault(digit, 0) + 1);

		}
		boolean isAuto = true;
		System.out.println(fr);
		for (int i = 0; i < s.length(); i++) {
			int requiredCount = Character.getNumericValue(s.charAt(i));
			System.out.println(i+" " +requiredCount);
			if(requiredCount != fr.getOrDefault(i, 0)){
				isAuto = false;
				break;
			}
			
			
//			{0=1, 1=2, 2=1}
//
//			
//			i value  
//			
//            0  1     fr[i] 1
//            1  2       2
//            2  1  1
//            3  0   0
		}
		if(isAuto) {
			System.out.println("is an automorphic number");
		}else {
			System.out.println("not an automorphic number");
		}

	}

}

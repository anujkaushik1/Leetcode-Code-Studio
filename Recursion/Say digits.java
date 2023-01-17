package twod;

import java.util.Scanner;

public class SayDigits {
	
	private static String nums[] = {
			"zero",
			"one",
			"two",
			"three",
			"four",
			"five",
			"six",
			"seven",
			"eight",
			"nine"	
	};
	
	private static void solve(int n, String str) {
		
		
		if(n == 0) {
			System.out.println(str);
			return ;
		}
			
		
		int number = n % 10;
		str = nums[number] + " " + str;
		
		solve(n / 10, str);
		
	}

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		solve(n, "");

	}

}

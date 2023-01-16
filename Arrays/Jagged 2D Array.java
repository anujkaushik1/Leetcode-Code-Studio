package twod;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("enter row : ");
		
		int n = scn.nextInt();

		int arr[][] = new int[4][];
		
		// creation
		for(int i = 0; i < n; i++) {
			System.out.println("enter col : ");
			int m = scn.nextInt();
			
			int colarr[] = new int[m];
			
			arr[i] = colarr;
			
		}
		
		// input arr
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				
				arr[i][j] = scn.nextInt();
				
			}
			
		}
		
		for(int row[] : arr) {
			for(int col : row) {
				System.out.print(col + "  ");
			}
			System.out.println();
		}

	}

}

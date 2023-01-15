import java.util.Scanner;

public class Sol {
	
	private static int gcd(int n1, int n2) {
		
		if(n1 == 0) {
			return n2;
		}
		
		if(n2 == 0) {
			return n1;
		}
		
		while(n1 != 0 && n2 != 0) {
			
			if(n1 > n2) {
				int diff = n1 - n2;
				n1 = diff;
			}
			else {
				int diff = n2 - n1;
				n2 = diff;
			}
			
		}
		
		return n2 == 0 ? n1 : n2;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int n1 = scn.nextInt();
	    
	    System.out.println(gcd(n,n1));


	}

}

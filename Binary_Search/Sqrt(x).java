
// WITH DECIMAL PRECESSION => 

package twod;

public class Squarerootdecimal {
	
	private static int sqrInteger(int n) {
		int i = 0;
		int ans = 0;
		while(i * i <= n) {
			int sqr = i * i;
			
			if(sqr == n) {
				return i;
			}
			else if(sqr < n) {
				ans = i;
			}
			
			i++;
		}
		
		return (ans);
	}
	
	private static void precession(int n, int prec, int sqrint) {
		double factor = 1, ans = sqrint;
		for(int i = 0; i < prec; i++) {
			
			factor = factor / 10;
			
			for(double j = ans; j * j <= n; j = j + factor) {
				ans = j;
			}
			
			
		}
		

		
	}

	public static void main(String[] args) {
		
		int sqrint = sqrInteger(37);
		precession(37, 3, sqrint);
	}

}





class Solution {

    private int bruteforce(int  n){
		int i = 0;
		int ans = 0;
		while(i * i <= n) {
			
			int sqr = i * i;
			
			if(sqr == n) {
				return i;
			}
			else if(sqr < n) {
				ans = i;
			}
			
			i++;
		}

        return ans;
    }

    private long binarySearchSol(int n){

        long s = 0, e = n;
        long ans = 0;
        while(s <= e){
            
            long mid = s + (e - s) / 2;

            if(mid * mid == n){
                return mid;
            }

            else if(mid * mid > n){
                e = mid - 1;
            }

            else{
                ans = mid;
                s = mid + 1;
            }

        }

        return ans;

    }
    public int mySqrt(int x) {
        // long bs = binarySearchSol(x);
        // int ans = (int) bs;
        // return ans;
        
        return bruteforce(x);

    }
}

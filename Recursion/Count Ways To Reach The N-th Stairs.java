import java.util.* ;
import java.io.*; 
public class Solution {
	public static int countDistinctWayToClimbStair(long n) {
		
        if(n < 0)
            return 0;
        
        if(n == 0)
            return 1;
        
        int oneStepAns = countDistinctWayToClimbStair(n - 1);
        int twoStepAns = countDistinctWayToClimbStair(n - 2);
        int biggerProblem = oneStepAns + twoStepAns;
        
        return biggerProblem;
	}
}

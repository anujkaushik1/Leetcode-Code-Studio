/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    static int getPower(int n, int x){
        
        if(x == 1)
            return n;
            
        int ans = getPower(n, x/2);
        
        ans = ans * ans;
        
        if(x % 2 != 0)
            ans = n * ans;
        
        return ans;
    }
    
	public static void main(String[] args) {
		System.out.println(getPower(3, 11));
	}
}

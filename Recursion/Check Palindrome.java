/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    static boolean checkPalindrome(String str, int i, int j){
        
        
        if(i > j)
            return true;
            
        char chI = str.charAt(i);
        char chJ = str.charAt(j);
        
        if(chI != chJ)
            return false;
            
        boolean ans = checkPalindrome(str, i + 1, j - 1);
        return ans;
        
    }
    
	public static void main(String[] args) {
	    
	    String str = "";
	    
	    System.out.println(checkPalindrome(str, 0, str.length() - 1));
		
	}
}










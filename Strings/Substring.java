/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    
	    String str = "code";
	    
	    for(int i = 0; i < str.length(); i++){
	        String ans = "";
	        for(int j = i; j < str.length(); j++){
	            ans += str.charAt(j);
	            System.out.println(ans);
	        }
	    }
		
	}
}

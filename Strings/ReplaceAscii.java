/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    
	    StringBuilder sb = new StringBuilder("cdEfG");
	    
	    for(int i = 0; i < sb.length(); i++){
	        char ch = sb.charAt(i);
	         
	        if(i % 2 == 0){
	            ch++;
	        }
	        
	        else{
	            ch--;
	        }
	        
	        sb.setCharAt(i, ch);
	        
	    }
		
		
		System.out.println(sb);
		
	}
}

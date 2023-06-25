/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    static void getReverse(StringBuilder str, int i, int j){
        
        
        if(i > j){
            System.out.println(str);
            return;
        }
        
        
        char charI = str.charAt(i);
        char charJ = str.charAt(j);
        
        
        str.setCharAt(i, charJ);
        str.setCharAt(j, charI);
        
        
        getReverse(str, i + 1, j - 1);
        
        
        
    }
    
	public static void main(String[] args) {
		String ip = "";
		
		StringBuilder sb = new StringBuilder(ip);
		
		getReverse(sb, 0, sb.length() - 1);
	}
}

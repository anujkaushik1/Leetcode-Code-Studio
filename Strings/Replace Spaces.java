import java.util.* ;
import java.io.*; 
public class Solution {
        public static StringBuilder replaceSpaces(StringBuilder str) {
		
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ' '){
                str.replace(i, i+1, "@40");
//                 str.insert(i, "@40");
//                 str.deleteCharAt(i + 3);
            }
        }
        
        return str;
        
	}
}

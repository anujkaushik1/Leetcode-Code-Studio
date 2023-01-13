// Optimized 

// Time => o(n)
// space => o(1)

import java.util.* ;
import java.io.*; 
public class Solution {
    
    private static char toLower(char ch){
        
        if(ch >= 'A' && ch <= 'Z'){
            char ans = (char)(ch - 'A' + 'a');
            return ans;
        }
        
        return ch;
        
    }

	public static boolean checkPalindrome(String str) {
	    int s = 0, e = str.length() - 1;
        
        while(s < e){
            char ch1 = str.charAt(s);
            char ch2 = str.charAt(e);
            
            ch1 = toLower(ch1);
            ch2 = toLower(ch2);
            
            if( !(ch1 >= 'a' && ch1 <= 'z') &&
                !(ch1 >= 'A' && ch1 <= 'Z') &&
                !(ch1 >= '0' && ch1 <= '9') ){
                
                s++;
                continue;
            }
            
            if( !(ch2 >= 'a' && ch2 <= 'z') &&
               !(ch2 >= 'A' && ch2 <= 'Z') &&
               !(ch2 >= '0' && ch2 <= '9') ){

                e--;
                continue;
            }
            
            if(ch1 != ch2){
                return false;
            }
            
            s++;
            e--;
             
        }
        return true;
	}
}



// Bruteforce

//TIME => O(N) + O(N)
// SPACE => O(N)

import java.util.* ;
import java.io.*; 
public class Solution {
    
    private static char toLowerCase(char ch){ // number, or any special char ko bhi allow krta hai => i/p -> A98oBZa =>  a98obza
        
        if(ch >= 'A' && ch <= 'Z'){
            char ans = (char)(ch - 'A' + 'a');
            return ans;
        }
        
        return ch;
        
    }

	public static boolean checkPalindrome(String str) {
	    
        String valid = "";  
        
        // creating only valid string
        for(int i = 0; i < str.length(); i++){  
               
            char ch = str.charAt(i);
            
             if( (ch >= 'a' && ch <= 'z') ||
                 (ch >= 'A' && ch <= 'Z') ||
                 (ch >= '0' && ch <= '9') ){
                
                 
                 ch = toLowerCase(ch);
                 valid += ch;
             }
            
        }
    
       int s = 0, e = valid.length() - 1;
        
        while(s < e){
            
            if(valid.charAt(s) !=  valid.charAt(e)){
                return false;
            }
            
            s++;
            e--;
        }

	 return true;
	}
}


//Space => o(1)
// time => o(n)

class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String str)
    {
       
       int alphabets[] = new int[26];
       
       for(int i = 0; i < str.length(); i++){
           
           char ch = str.charAt(i);
           
           int idx = ch - 'a';
           
           alphabets[idx]++;
           
       }
       int max = -1, idx = 0;
       
       for(int i = 0; i < 26; i++){
           
           if(alphabets[i] > max){
               max = alphabets[i];
               idx = i;
           }
           
       }
       
       char ans = (char)(idx + 'a');
       return ans;
       
    }
    
}

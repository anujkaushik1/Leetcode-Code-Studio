
// time => o(n)
// space => o(part) + o(n)
class Solution {
    public String removeOccurrences(String str, String part) {
        
        int i = 0;
        int j = part.length() - 1;

        while(j < str.length()){

            String sub = str.substring(i, j + 1); // o(part) 

            if(sub.equals(part)){
                String s1 = str.substring(0, i); //o(n)
                String s2 = str.substring(j + 1, str.length());  //o(n)

                str = s1 + s2;
                i = 0;
                j = part.length() - 1;
            }
            else{
                i++;
                j++;
            }

        }

        return str;
        
    }
}

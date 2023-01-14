// time - o(n)
// space - o(n * n)

class Solution {
    public String removeDuplicates(String s) {
        int i = 0, j = 1;

        StringBuilder str = new StringBuilder(s);

        while(j < str.length()){

            if(str.charAt(i) == str.charAt(j)){

                str.deleteCharAt(i);  o(n)
                str.deleteCharAt(i);
                
                if(i > 0 && j > 1){
                    i = i - 1;
                    j = j - 1;
                }
            }

            else{
                i++;
                j++;
            }

        }
        return str.toString();
    }
}

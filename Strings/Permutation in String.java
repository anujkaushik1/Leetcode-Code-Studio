
//space - o(1)
// time - o(n1) + o(n2) * o(n1) => o(n2 * n1)
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int alpha[] = new int[26];

        for(int i = 0; i < s1.length(); i++){
            int index = s1.charAt(i) - 'a';
            alpha[index]++;
        }

        int i = 0, j = s1.length() - 1;

        while(j < s2.length()){

            int alpha1[] = new int[26];

            for(int k = i; k <= j; k++){
                int index = s2.charAt(k) - 'a';
                alpha1[index]++;
            }

            boolean res = Arrays.equals(alpha, alpha1);

            if(res) return true;

            j++;
            i++;

        }

        return false;

    }
}



// TLE (BRUTEFORCE)
// TIME => O(N! * O(N)
// SPACE => O(N)
class Solution {
    private int getFact(int n){
        int ans = 1;
        while(n != 1){

            ans *= n;
            n--;
        }

        return ans;

    }
    public boolean checkInclusion(String s1, String s2) {
        
        int fact = getFact(s1.length());

        for(int i = 0; i < fact; i++){

            StringBuilder sb = new StringBuilder(s1);
            String ans = "";
            int div = s1.length();
            int temp = i;
            while(div != 0){
                int rem = temp % div;
                temp = temp / div;
                
                ans += sb.charAt(rem);
                sb.deleteCharAt(rem);

                div--;
            }
            
            if(s2.contains(ans)){
                return true;
            }

        }

        return false;

    }
}

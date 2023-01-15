
// time => o(n)
// space => o(1)

ArrayList<Character> al = new ArrayList<>();
        int count = 1;
        al.add(chars[0]);

        int i = 0, j = 1;

        while(j < chars.length){

            if(chars[i] == chars[j])
                count ++;
            
            else{

                if(count > 1){
                    
                    if(count >= 10){
                        
                       String strCount = count + "";

                      for(int x = 0; x< strCount.length(); x++){
                          char c = strCount.charAt(x);
                          al.add((char) (c + '0'));
                     }
                        
                       count = 1;

                    }
                    else{
                        char charCount = (char)(count + '0');
                        al.add(charCount);
                        count = 1;
                    }
                }

                al.add(chars[j]);
            }

            i++;
            j++;

        }
        
       if(count > 1){
                    
            if(count >= 10){

               String strCount = count + "";
               for(int x = 0; x < strCount.length(); x++){
                   char c = strCount.charAt(x);
                   al.add(c);
               }
                        
               count = 1;
            }
            else{
                char charCount = (char)(count + '0');
                al.add(charCount);
            }
        }
        
        for(int x = 0; x < al.size(); x++){
            chars[x] = al.get(x);
        }

        return al.size();




// test case fail when count > 99 due to ascii -> [0-9]
class Solution {
    public int compress(char[] chars) {
        ArrayList<Character> al = new ArrayList<>();
        int count = 1;
        al.add(chars[0]);

        int i = 0, j = 1;

        while(j < chars.length){

            if(chars[i] == chars[j])
                count ++;
            
            else{

                if(count > 1){
                    
                    if(count >= 10){

                        int rem = count % 10;
                        int quo = count / 10;
                        char charQuo = (char)(quo + '0');  // fail hoga when quo = 10 because ascii of 10 is : not 10 ascii -< [0-9]
                        char remQuo = (char) (rem + '0');
                        al.add(charQuo);
                        al.add(remQuo);
                        count = 1;
                    }
                    else{
                        char charCount = (char)(count + '0');
                        al.add(charCount);
                        count = 1;
                    }
                }

                al.add(chars[j]);
            }

            i++;
            j++;

        }
        
       if(count > 1){
                    
            if(count >= 10){

                int rem = count % 10;
                int quo = count / 10;
                char charQuo = (char)(quo + '0');
                char remQuo = (char) (rem + '0');
                al.add(charQuo);
                al.add(remQuo);
            }
            else{
                char charCount = (char)(count + '0');
                al.add(charCount);
            }
        }
        
        for(int x = 0; x < al.size(); x++){
            chars[x] = al.get(x);
        }

        return al.size();
    }
}

//3RD APPROACH =>

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      
      //TIME => O(N + M)
      //SPACE => O(1)
        
        int k = nums1.length - 1;
        int i = m - 1, j = n - 1;

        while(i >= 0 && j >= 0){

            if(nums1[i] < nums2[j]){
                nums1[k] = nums2[j];
                j--;
            }

            else{
                nums1[k] = nums1[i];
                i--;
            }

            k--;
        }

        while(i >= 0){
            nums1[k] = nums1[i];
            i--;
            k--;
        }
        while(j >= 0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }

    }   
}



//2nd approach =>
//SPACE => O(1)
// TIME => O((M+N)LOG(N+M))
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        for(int i = m, j = 0; i < nums1.length; i++,j++){
            nums1[i] = nums2[j];
        }

       Arrays.sort(nums1);
    }
}

class Solution {
    
    //TIME COMPLEXITY => O(N+M) + O(M) + O(N) + O(M) => O(M + N)
    //SPACE => O(N+M)
  
    public void merge(int[] nums1, int m, int[] nums2, int n) {

     int ansArray[] = new int[nums1.length];   // o(n+m)

     int i = 0, j = 0, k = 0;

     while(i < m && j < n){   // o(n+m)

         if(nums1[i] < nums2[j]){
            ansArray[k] = nums1[i];
            i++;
         }
         else{
             ansArray[k] = nums2[j];
             j++;
         }

         k++;

     }

    while(i < m){   // o(m)
        ansArray[k] = nums1[i];
        i++;
        k++;
    }

    while(j < n){      //o(N)
        ansArray[k] = nums2[j];
        j++;
        k++;
    }

    for(int x = 0; x < ansArray.length; x++){     // o(M)
        nums1[x] = ansArray[x];
    }


    }
}

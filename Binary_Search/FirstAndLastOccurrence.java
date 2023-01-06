import java.util.* ;
import java.io.*; 
public class Solution {
    
   private static int first(ArrayList<Integer> arr, int n, int k){
       
       int s = 0, e = n - 1, ans = -1;
       
       while(s <= e){
           int mid = s + (e - s) / 2;
           if(arr.get(mid) == k){
               ans = mid;
               e = mid - 1;
           }
           
           else if(k > arr.get(mid)){
               s = mid + 1;
           }
           else{
               
               e = mid - 1;
               
           } 
       }
       
       return ans;
       
   }
    
    private static int last(ArrayList<Integer> arr, int n, int k){
       
       int s = 0, e = n - 1, ans = -1;
       
       while(s <= e){
           int mid = s + (e - s) / 2;
           if(arr.get(mid) == k){
               ans = mid;
               s = mid + 1;
           }
           
           else if(k > arr.get(mid)){
               s = mid + 1;
           }
           else{
               
               e = mid - 1;
               
           } 
       }
       
       return ans;
       
    }

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
       
        int fi = first(arr, n, k);
        int li = last(arr, n, k);
        
        int ans[] = {fi, li};
        
        return ans;

    }

};

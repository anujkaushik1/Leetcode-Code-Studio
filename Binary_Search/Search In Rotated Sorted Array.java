// SECOND APPROACH =>

import java.util.* ;
import java.io.*; 
public class Solution {
    public static int findPosition(ArrayList<Integer> arr, int n, int k) {
       int s = 0;
       int e = n - 1;
        
       while(s <= e){
           int mid = s + (e - s) / 2;
           
           if(arr.get(mid) == k){
               return mid;
           }
           
               // 1st line mei exist
           else if(arr.get(0) <= arr.get(mid)){
               
               if(arr.get(s) <= k && k <= arr.get(mid)){
                   e = mid - 1;
               }
               else{
                   s = mid + 1;
               }
               
           }
            // 2nd line mei exist
           else{
               if(arr.get(mid) <= k && k <= arr.get(e)){
                   s = mid + 1;
               }
               else{
                   e = mid - 1;
               }
           }
               
       }
        
        return -1;
    }

}





// FIRST APPROACH => 

import java.util.* ;
import java.io.*; 


public class Solution {
    
    private static int findElementUsingBS(ArrayList<Integer> arr, int s, int e, int ele){
        
        while(s <= e){
            
            int mid = s + (e - s) / 2;
            if(arr.get(mid) == ele){
                return mid;
            }
            
            else if(arr.get(mid) < ele){
                s = mid + 1;
            }
            
            else{
                e = mid - 1;
            }
            
        }
        
        return -1;
        
    }
    
     private static int pivotIndex(ArrayList<Integer> arr) {

        int s = 0, e = arr.size() - 1;

        while(s < e){
            int mid = s + (e - s) / 2;

            if(arr.get(mid) >= arr.get(0)){
                s = mid + 1;
            }
            else{
                e = mid;
            }
        }
       
         return e;
        
     }
    public static int findPosition(ArrayList<Integer> arr, int n, int target) {
        int pivot = pivotIndex(arr);
        
        // konsi line mei hai 1st line or 2nd line
         if(arr.get(pivot) <= target && target <= arr.get(arr.size() - 1)){
             // 2nd line
            return findElementUsingBS(arr, pivot, arr.size() - 1, target); 
             
         }
         else{
             
             return findElementUsingBS(arr, 0, pivot - 1, target);
             
         }
    }

}

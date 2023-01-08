import java.util.* ;
import java.io.*; 
public class Solution {
    
    private static boolean isPossible(ArrayList<Integer> arr, int n, int m, int mid){
        int studentCount = 1;
        int pagesSum = 0;
        for(int i = 0; i < n; i++){
            
            if(pagesSum + arr.get(i) <= mid){
                pagesSum += arr.get(i);
            }
            
            else{
                studentCount ++;
                
                if(studentCount > m || arr.get(i)>mid){
                    return false;
                }
                pagesSum = 0;
                pagesSum += arr.get(i);
            }
            
        }
        
        return true;
    }
    
    public static int allocateBooks(ArrayList<Integer> arr, int n, int m) {
        int s = 0;
        int sum = 0;
        
        for(int val : arr){
            sum += val;
        }
        int e = sum;
        int ans = -1;
        while(s <= e){
            
            int mid = s + (e - s) / 2;     
            if(isPossible(arr, n, m, mid)){
                ans = mid;
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
            
        }
        
        return ans;
    }
}

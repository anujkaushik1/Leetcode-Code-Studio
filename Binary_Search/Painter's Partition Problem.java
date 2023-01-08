import java.util.ArrayList;

public class Solution 
{
    private static boolean isPossible(ArrayList<Integer> arr, int k, int mid){
        
        int painter = 1;
        int boardSum = 0;
        
        for(int i = 0; i < arr.size(); i++){
            
            if(boardSum + arr.get(i) <= mid){
                boardSum += arr.get(i);
            }
            else{
                painter++;
                
                if(painter > k || arr.get(i) > mid){
                    return false;
                }
                
                boardSum = 0;
                boardSum += arr.get(i);
            }
            
        }
        
        return true;
        
    }
    public static int findLargestMinDistance(ArrayList<Integer> arr, int k)
    {
        int s = 0;
        int e = 0;
        
        for(int val : arr){
            e += val;
        }
        
        int ans = -1;
        
        while(s <= e){
            
            int mid = s + (e - s) / 2;
            
            if(isPossible(arr, k, mid)){
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

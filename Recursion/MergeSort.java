/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    static int[] mergeSortedArray(int firstHalf[], int secondHalf[]){
        
        int ans[] = new int[firstHalf.length + secondHalf.length];
        
        int i = 0, j = 0, k = 0;
        
        while(i < firstHalf.length && j < secondHalf.length){
            
            if(firstHalf[i] < secondHalf[j]){
                ans[k] = firstHalf[i];
                i++;
            }
            
            else{
                ans[k] = secondHalf[j];
                j++;
            }
            
            k++;
            
        }
        
        while(i < firstHalf.length){
            ans[k] = firstHalf[i];
            i++;
            k++;
        }
        
        while(j < secondHalf.length){
            ans[k] = secondHalf[j];
            j++;
            k++;
        }
        
        return ans;
        
    }
    
    static int[] mergeSort(int arr[], int lo, int hi){
        
        if(lo == hi){
            int base[] = {arr[lo]};
            return base;
        }
        
        int mid = lo + (hi - lo) / 2;
        
        int firstHalf[] = mergeSort(arr, lo, mid);
        int secondHalf[] = mergeSort(arr, mid + 1, hi);
        
        int mergeSortedArr[] = mergeSortedArray(firstHalf, secondHalf);
        
        return mergeSortedArr;
        
    }
    
	public static void main(String[] args) {
	    
	    int arr[] = {4,2,7,9,1,5};
	    
	   int ans[] =  mergeSort(arr, 0, arr.length - 1);
	    
	    for(int val : ans){
	        System.out.println(val);
	    }
	
	}
}

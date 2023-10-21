class Solution {

      private static void swap(int arr[], int i, int j){
         int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            
    }
    
    private static void reverse(int arr[], int i, int j){
        
        while(i < j){
            swap(arr, i, j);
            i++;
            j--;
        }
        
    }
    

    public void nextPermutation(int[] arr) {

			if(arr.length == 1){
				return;
			}
	    
	    int i = arr.length - 2;
	    int j = arr.length - 1;
	    
	    int smallerAnsIdx = -1;
	    while(i >= 0){
	        
	        if(arr[i] < arr[j]){
	            smallerAnsIdx = i;
	            break;
	        }
	        
	        i--;
	        j--;
	    }
	    
	    if(smallerAnsIdx == -1){
	        reverse(arr, 0, arr.length - 1);
					return;
	    }
	       
	    int pottAnsIdx = 0;
	    for(int x = smallerAnsIdx + 1; x < arr.length; x++){
	        
	        if(arr[x] > arr[smallerAnsIdx]){	    
	            pottAnsIdx = x;
	        }
	        
	        else{
	            break;
	        }
	        
	    }
	    
	    swap(arr, pottAnsIdx, smallerAnsIdx);
	    
	    reverse(arr, smallerAnsIdx + 1, arr.length - 1);
    }
}

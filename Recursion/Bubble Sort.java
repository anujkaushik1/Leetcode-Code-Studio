/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    static void swap(int arr[], int i, int j){
        
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
    }
    
    static void bubbleSort(int arr[], int n){
        
        if(n == 1)
            return ;
            
        
        for(int i = 0; i < n - 1; i++){
            
            if(arr[i] > arr[i + 1])
                swap(arr, i, i + 1);
        }
        
        
        bubbleSort(arr, n - 1);
        
    }
    
	public static void main(String[] args) {
		int arr[] = {9,8,7,6,5,4,3,2,1};
		
		bubbleSort(arr, arr.length);
		
		for(int val : arr)
		    System.out.print(val + "--");
	}
}

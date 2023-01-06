pivotIndex/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
     public static int pivotIndex(int[] arr) {

        int s = 0, e = arr.length - 1;

        while(s < e){
            int mid = s + (e - s) / 2;

            if(arr[mid] >= arr[0]){
                s = mid + 1;
            }
            else{
                e = mid;
            }
        }

        return s;
        
    }
	public static void main(String[] args) {
	    int arr[] = {8,10,17,19, 1,2,3};
	    System.out.println(pivotIndex(arr));
	}
}

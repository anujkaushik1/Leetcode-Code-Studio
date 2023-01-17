package twod;

public class IsSorted {
	
	private static boolean solve(int arr[], int idx) {
		
		if(arr.length == 0 || arr.length == 1 || idx == arr.length - 1)
			return true;
		
		if(arr[idx] > arr[idx + 1])
			return false;
		
		else {
			boolean ans = solve(arr, idx + 1);
			return ans;
			
		}
		
	}

	public static void main(String[] args) {
		
		int arr[] = {2,4,6,9,11,13};
		
		System.out.println(solve(arr, 0));

	}

}

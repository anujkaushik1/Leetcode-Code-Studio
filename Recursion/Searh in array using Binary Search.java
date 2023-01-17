package twod;

public class Search {
	
	private static void binarySearch(int arr[], int s, int e, int key) {
		
		if(s > e) {
			System.out.print("Not available");
			return ;
		}
		
		int mid = s + (e - s) / 2;
		
		if(arr[mid] == key) {
			System.out.print(mid);
			return ;
		}
		
		
		if(arr[mid] < key) {
			s = mid + 1;
		}
		
		else {
			e = mid - 1;
		}
		
		binarySearch(arr, s, e, key);
		
	}

	public static void main(String[] args) {
		
		int arr[] = {2,4,6,10,14,18};
		
		int key = 16;
		
		binarySearch(arr, 0, arr.length - 1, key);
		
	}
}

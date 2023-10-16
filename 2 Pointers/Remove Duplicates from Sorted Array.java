class Solution {
    public int removeDuplicates(int[] nums) {
        	int i = 0;
		int k = 1;
		while(i < nums.length){
		    
		    int j = i + 1;
		    
		    while(j < nums.length && nums[j] == nums[i]){
		        j++;
		    }
		    
		    if(j >= nums.length) break;
		    
		    nums[k] = nums[j];
		    i = j;
		    k++;
		}

        return k;
    }
}


// 2nd app =>
class Solution {
    public int removeDuplicates(int[] nums) {
        int inIdx = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i - 1] != nums[i]){
                nums[inIdx] = nums[i];
                inIdx++;
            }
        }

        return inIdx;
    }
}

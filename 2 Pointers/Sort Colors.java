class Solution {
    private void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void sortColors(int[] nums) {
        int i = 0, j = 0, k = nums.length - 1;

        while(j <= k){
            int val = nums[j];

            if(val == 0){
                swap(nums, i, j);
                i++;
                j++;
            }

            if(val == 1){
                j++;
            }

            if(val == 2){
                swap(nums, j, k);
                k--;
            }
        }
    }
}

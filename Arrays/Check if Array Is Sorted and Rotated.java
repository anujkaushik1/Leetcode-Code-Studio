class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        for(int i = 1; i <= nums.length; i++){
            if(nums[(i - 1) % nums.length] > nums[i % nums.length]){
                count ++;
            }
        }

        return count == 1 || count == 0;

    }
}

class Solution {
    public int[] twoSum(int[] nums, int tar) {
        int st = 0;
        int en = nums.length - 1;
        int ans[] = new int[2];

        while(st < en){

            int sum = nums[st] + nums[en];

            if(sum > tar){
                if(nums[st] > nums[en])
                    st--;
                else
                    en--;
            }

           else if(sum < tar){
                  if(nums[st] > nums[en])
                    en++;
                else
                    st++;;
            }

              else if(sum == tar){
            ans[0] = st + 1;
            ans[1] = en + 1;
            break;
        }

        }

         return ans;
    }


}

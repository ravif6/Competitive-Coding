class Solution {
    public int findDuplicate(int[] nums) {
        int ans =0,n = nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[Math.abs(nums[i])-1]<0)
            {
                return Math.abs(nums[i]);
            }
            nums[Math.abs(nums[i])-1]*=-1;
        }
    }
}
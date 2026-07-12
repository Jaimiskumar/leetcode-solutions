class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int i=0;
        int bestMax=nums[i];
        int bestMin=nums[i];
        int ans=Math.abs(nums[i]);
        for(i=1;i<nums.length;i++){
            bestMax=Math.max(bestMax+nums[i],nums[i]);
            bestMin=Math.min(bestMin+nums[i],nums[i]);
            ans=Math.max(ans,Math.max(bestMax,Math.abs(bestMin)));
        }
        return ans;
    }
}
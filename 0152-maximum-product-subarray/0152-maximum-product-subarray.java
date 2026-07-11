class Solution {
    public int maxProduct(int[] nums) {
        int bestmin=nums[0];
        int bestmax=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            int v1=nums[i];
            int v2=nums[i]*bestmin;
            int v3=nums[i]*bestmax;

            int newmax=Math.max(v1,Math.max(v2,v3));
            int newmin=Math.min(v1,Math.min(v2,v3));
            bestmax = newmax;
            bestmin = newmin;
            ans=Math.max(ans,Math.max(bestmin,bestmax));
        }
        return ans;
    }
}
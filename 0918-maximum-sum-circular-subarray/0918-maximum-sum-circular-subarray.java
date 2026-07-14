class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int i=0;
        int a1=nums[i];
        int a2=nums[i];
        int ans1=nums[i];
        int x=nums[i];
        for(i=1;i<nums.length;i++){
            int v1=a1+nums[i];
            int v2=nums[i];
            a1=Math.max(v1,v2);
            ans1=Math.max(ans1,a1);
        }
        if(ans1 < 0)
            return ans1;
        for(i=1;i<nums.length;i++){
            int p1=a2+nums[i];
            int p2=nums[i];
            a2=Math.min(p1,p2);
            x=Math.min(x,a2);
        }
        int sum=0;
        for(int j=0;j<nums.length;j++){
            sum=sum+nums[j];
        }
        int ans2=sum-x;
        return Math.max(ans1,ans2);
    }
}
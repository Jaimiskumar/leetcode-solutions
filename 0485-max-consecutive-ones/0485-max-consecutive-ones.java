class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l=0;
        int r=0;
        int maxone=0;
        int i=0;
        while(r<nums.length){
            if(nums[r]==1){
                int len=r-l+1;
                maxone=Math.max(len,maxone);
                r++;
            }else if(nums[r]==0){
                l=r+1;
                r++;
            }
            
        }
        return maxone;
    }
}
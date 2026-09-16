class Solution {
    public boolean canJump(int[] nums) {
        int i=0;
        int idx=0;
        while(i<nums.length){
            if(i>idx){
                return false;
            }else{
                idx=Math.max(idx,i+nums[i]);
            }
            i++;
        }
        return true;
    }
}

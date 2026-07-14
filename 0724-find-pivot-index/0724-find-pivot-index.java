class Solution {
    public int pivotIndex(int[] nums) {
        int left=0;
        int right;
        int sum=0;
        for(int j=0;j<nums.length;j++){
            sum=sum+nums[j];
        }
        for(int i=0;i<nums.length;i++){
            right=sum-nums[i]-left;
            if(left==right){
                return i;
            }
            left=left+nums[i];
        }
        return -1;
    }
}
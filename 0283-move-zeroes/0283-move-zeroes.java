class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length == 0) return;
        // while (j < nums.length) {
        //     if (nums[j] != 0) {
        //         int temp = nums[i];
        //         nums[i] = nums[j];
        //         nums[j] = temp;
        //         i++;
        //     }
        //     j++;
        // }
        int idx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[idx++]=nums[i];
            }
        }
        for(int j=idx;j<nums.length;j++){
            nums[idx++]=0;
        }
    }
}
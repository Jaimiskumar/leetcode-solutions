class Solution {
    public void rotate(int[] nums, int k) {
        int idx=0;
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[(idx+k)%res.length]=nums[i];
            idx++;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = res[i];
        }
    }
}
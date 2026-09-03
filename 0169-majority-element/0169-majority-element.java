class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int var=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                count=1;
                var=nums[i];
            }else if(var==nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return var;
    }
}
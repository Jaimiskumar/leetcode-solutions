class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
            else if(nums[i]>max){
                max=nums[i];
            }
        }
        int ans=1;
        for(int i=1;i<=min;i++){
            if(min%i==0 && max%i==0){
                if(ans<i){
                    ans=i;
                }
            }
        }
        return ans;
    }
}
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int low=0;
        int high=k-1;
        int sum=0;
        for(int i=low;i<=high;i++){
            sum=sum+nums[i];
        }
        double avg=(double) sum/k;
        double res = avg;
        while(high<nums.length){
            res=Math.max(res,avg);
            low++;
            high++;
            if(high==nums.length){
                break;
            }
            sum=sum-nums[low-1];
            sum=sum+nums[high];
            avg=(double) sum/k;
        }
        return res;
    }
}
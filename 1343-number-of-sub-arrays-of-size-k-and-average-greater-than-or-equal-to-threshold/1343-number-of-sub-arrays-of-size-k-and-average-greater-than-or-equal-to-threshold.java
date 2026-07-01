class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int res=0;
        int num=threshold*k;
        int sum=0;
        int low=0;
        int high=k-1;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        if(sum>=num){
            res++;
        }
        while(high<arr.length){
            low++;
            high++;
            if(high==arr.length){
                break;
            }
            sum=sum-arr[low-1];
            sum=sum+arr[high];
            if(sum>=num){
                res++;
            }
        }
        return res;
    }
}
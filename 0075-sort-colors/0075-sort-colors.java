// class Solution {
//     public void sortColors(int[] nums) {
//         int low=0;
//         int mid=0;
//         int high=nums.length-1;
//         while(mid<=high){
//             if(nums[mid]==0){
//                 int temp=nums[low];
//                 nums[low]=nums[mid];
//                 nums[mid]=temp;
//                 low++;
//                 mid++;
//             }
//             else if(nums[mid]==1){
//                 mid++;
//             }
//             else{
//                 int temp=nums[mid];
//                 nums[mid]=nums[high];
//                 nums[high]=temp;
//                 high--;
//             }
//         }
//     }
// }
class Solution {
    public void sortColors(int[] nums) {
        qs(nums,0,nums.length-1);
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    } 
    public void qs(int[] nums,int low,int high){
        if(low<high){
            int pIndex=partition(nums,low,high);
            qs(nums,low,pIndex-1);
            qs(nums,pIndex+1,high);
        }
    }
    private int partition(int[] nums,int low,int high){
        int pivot=nums[low];
        int i=low;
        int j=high;
        while(i<j){
            while(i<=high && nums[i]<=pivot){
                i++;
            }
            while(j>=low && nums[j]>pivot){
                j--;
            }
            if(i<j){
                swap(nums,i,j);
            }
        }
        swap(nums,low,j);
        return j;
    }
}
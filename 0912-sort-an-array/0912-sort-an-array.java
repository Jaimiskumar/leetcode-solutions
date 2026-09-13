// import java.util.ArrayList;

// class Solution {
//     public int[] sortArray(int[] nums){
//         if(nums==null || nums.length<=1){
//             return nums;
//         }
//         mergeSort(nums,0,nums.length-1);
//         return nums;
//     }

//     private void mergeSort(int[] nums,int low,int high){
//         if(low>=high){
//             return;
//         }
//         int mid=low+(high-low)/2;
//         mergeSort(nums,low,mid);
//         mergeSort(nums,mid+1,high);
//         merge(nums,low,mid,high);
//     }

//     private void merge(int[] nums,int low,int mid,int high){
//         ArrayList<Integer> list=new ArrayList<>();
//         int left=low;
//         int right=mid+1;
//         while(left<=mid && right<=high){
//             if(nums[left]<=nums[right]){
//                 list.add(nums[left]);
//                 left++;
//             }else{
//                 list.add(nums[right]);
//                 right++;
//             }
//         }
//         while(left<=mid){
//             list.add(nums[left]);
//             left++;
//         }
//         while(right<=high){
//             list.add(nums[right]);
//             right++;
//         }
//         for(int i=low;i<=high;i++) {
//             nums[i]=list.get(i-low);
//         }
//     }
// }
import java.util.Random;
class Solution {
    
    private final Random random = new Random();

    public int[] sortArray(int[] nums){
        if(nums==null || nums.length<=1){
            return nums;
        }
        qs(nums,0,nums.length-1);
        return nums;
    }
    public static void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    private void qs(int[] nums,int low,int high){
        if(low<high){
            int pIndex=partition(nums,low,high);
            qs(nums,low,pIndex-1);
            qs(nums,pIndex+1,high);
        }
    }
    private int partition(int[] nums,int low,int high){
        int randomIndex=low+random.nextInt(high-low+1);
        swap(nums,low,randomIndex);
        int pivot=nums[low];
        int i=low;
        int j=high;
        while(i<j){
            while(nums[i]<=pivot && i<high){
                i++;
            }
            while(nums[j]>pivot && j>low){
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

// class Solution {
//     public int searchInsert(int[] nums, int target) {
//         ArrayList<Integer> list=new ArrayList<Integer>(nums.length+1);
//         for(int i=0;i<nums.length;i++){
//             list.add(nums[i]);
//         }
//         list.add(target);
//         list.sort(null);
//         return list.indexOf(target);
//     }
// }

class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int ans=nums.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>=target){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}
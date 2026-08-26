class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean ans=false;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!set.add(nums[i])){
                return true; 
            }
        }
        return false;
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(i,nums[i]);
        }
        Arrays.sort(nums);
        int low=0;
        int high=nums.length-1;
        int i=0;
        int j=0;
        while(low<=high){
            if(nums[low]+nums[high]==target){
                i=nums[low];
                j=nums[high];
                break;
            }
            else if(nums[low]+nums[high]<target){
                low++;
            }
            else if(nums[low]+nums[high]>target){
                high--;
            }
        }
        Integer index1=null;
        Integer index2=null;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(i==j && entry.getValue().equals(i)){
                if(index1==null){
                    index1=entry.getKey();
                }else if(index2==null){
                    index2=entry.getKey();
                    break;
                }
            }else{
                if(entry.getValue().equals(i) && index1==null){
                    index1=entry.getKey();
                }else if(entry.getValue().equals(j) && index2==null){
                    index2=entry.getKey();
                }
            }
            if(index1!=null && index2!=null){
                break;
            }
        }
        return new int[] {index1,index2}; 
    }
}
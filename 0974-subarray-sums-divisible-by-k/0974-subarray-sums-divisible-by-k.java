class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        int ans=0;
        int sum=0;
        map.put(0,1);
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
            int reminder=sum%k;
            if(reminder<0){
                reminder=reminder+k;
            }
            if(map.containsKey(reminder)){
                ans=ans+map.get(reminder);
            }
            map.put(reminder,map.getOrDefault(reminder,0)+1);
        }
        return ans;
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int n=s.length();
        int l=0;
        int r=0;
        int maxlen=0;
        while(r<n){
            if(map.containsKey(s.charAt(r)) && map.get(s.charAt(r))>=l){
                    l=map.get(s.charAt(r))+1;
            }
            int len=r-l+1;
            maxlen=Math.max(maxlen,len);
            map.put(s.charAt(r),r);
            r++;
        }
        return maxlen;
    }
}
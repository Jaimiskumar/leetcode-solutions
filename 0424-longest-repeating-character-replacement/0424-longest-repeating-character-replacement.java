class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int maxf=0;
        int maxlen=0;
        int l=0;
        int r=0;
        while(r<s.length()){
            count[s.charAt(r)-'A']++;
            maxf=Math.max(maxf,count[s.charAt(r)-'A']);
            if((r-l+1)-maxf>k){
                count[s.charAt(l)-'A']--;
                l++;
            }
            maxlen=Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
    }
}
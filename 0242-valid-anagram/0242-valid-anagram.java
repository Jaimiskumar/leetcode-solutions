class Solution {
    public boolean isAnagram(String s, String t) {
        boolean ans=false;
        if(s.length()!=t.length()){
            return ans;
        }else{
            char[] a=s.toCharArray();
            char[] b=t.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            if(Arrays.equals(a,b)){
                ans=true;
            }
        }
        return ans;
    }
}
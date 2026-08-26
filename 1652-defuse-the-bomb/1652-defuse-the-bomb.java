class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] res=new int[code.length];
        if(k==0){
            return res;
        }
        int idx=0;
        int i=0;
        while(i<code.length){
            int sum=0;
            if(k>0){
                int l=1;
                while(l<=k){
                    sum=sum+code[(i+l)%code.length];
                    l++;
                }
            }
            if(k<0){
                int r=1;
                while(r<=-k){
                    sum=sum+code[(i-r+code.length)%code.length];
                    r++;
                }
            }
            res[idx]=sum;
            idx++;
            i++;
        }
        return res;
    }
}
class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }
        if(divisor==1){
            return dividend;
        }
        if(divisor==-1){
            return -dividend;
        }
        boolean v1=dividend<0;
        boolean v2=divisor<0;
        long n1=Math.abs((long)dividend);
        long n2=Math.abs((long)divisor);
        long res=0;
        while(n1>=n2){
            n1-=n2;
            res++;
        }
        if(v1!=v2){
            res=-res;
        }
        return (int)res;
    }
}
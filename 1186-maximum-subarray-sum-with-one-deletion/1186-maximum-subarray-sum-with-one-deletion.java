class Solution {
    public int maximumSum(int[] arr) {

        int noDelete=arr[0];
        int oneDelete=Integer.MIN_VALUE;
        int result=arr[0];
        for(int i=1;i<arr.length;i++){
            int prevnoDelete=noDelete;
            int prevoneDelete=oneDelete;
            noDelete=Math.max(prevnoDelete+arr[i],arr[i]);
            int v1;
            if(prevoneDelete==Integer.MIN_VALUE){
                v1=arr[i];
            }else{
                v1=prevoneDelete+arr[i];
            }
            oneDelete=Math.max(v1,prevnoDelete);
            result=Math.max(result,Math.max(noDelete,oneDelete));
        }
        return result;
    }
}
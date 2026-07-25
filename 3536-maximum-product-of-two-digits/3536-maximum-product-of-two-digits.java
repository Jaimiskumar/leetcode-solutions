class Solution {
    public int maxProduct(int n) {
        List<Integer> arr=new ArrayList<>();
        while(n>0){
            arr.add(0,n%10);
            n/=10;
        }
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>max1){
                max1=arr.get(i);
            }
        }
        arr.remove(Integer.valueOf(max1));
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>max2){
                max2=arr.get(i);
            }
        }
        return max1*max2;
    }
}
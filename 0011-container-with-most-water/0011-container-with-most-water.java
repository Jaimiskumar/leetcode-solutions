class Solution {
    public int maxArea(int[] height) {
        int lheight=0;
        int rheight=0;
        int i=0;
        int j=height.length-1;
        int maxarea=Integer.MIN_VALUE;
        int area=0;
        while(i<j){
            lheight=height[i];
            rheight=height[j];
            if(lheight<rheight){
                area=(j-i)*lheight;
                i++;
            }else{
                area=(j-i)*rheight;
                j--;
            }
            maxarea=Math.max(maxarea,area);
        }
        return maxarea;
    }
}
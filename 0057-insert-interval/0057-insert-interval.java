class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        boolean insert=false;
        if(intervals.length==0){
            return new int[][]{newInterval};
        }
        for(int i=0;i<intervals.length;i++){
            if(insert==false && intervals[i][0]>=newInterval[0]){
                res.add(newInterval);
                insert=true;
            }
            res.add(intervals[i]);
        }
        if(!insert){
            res.add(newInterval);
        }
        int start1=res.get(0)[0];
        int end1=res.get(0)[1];
        for(int i=1;i<res.size();i++){
            int start2=res.get(i)[0];
            int end2=res.get(i)[1];
            if(end1>=start2){
                start1=start1;
                end1=Math.max(end1,end2);
                continue;
            }
            else{
                ans.add(new ArrayList<>(List.of(start1,end1)));
                start1=start2;
                end1=end2;
            }
        }
        ans.add(new ArrayList<>(List.of(start1,end1)));
        int[][] array2D = new int[ans.size()][2];
        for(int i=0;i<ans.size();i++){
            array2D[i][0]=ans.get(i).get(0);
            array2D[i][1]=ans.get(i).get(1);
        }
        return array2D;
    }
}
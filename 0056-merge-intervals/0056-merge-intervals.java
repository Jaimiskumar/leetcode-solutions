class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals==null || intervals.length==0){
            return new int[0][0];
        }
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        List<List<Integer>> res=new ArrayList<>();
        int start1=intervals[0][0];
        int end1=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            int start2=intervals[i][0];
            int end2=intervals[i][1];
            if(end1>=start2){
                start1=start1;
                end1=Math.max(end1,end2);
                continue;
            }
            else{
                res.add(new ArrayList<>(List.of(start1,end1)));
                start1=start2;
                end1=end2;
            }
        }
        res.add(new ArrayList<>(List.of(start1,end1)));
        int[][] array2D = new int[res.size()][2];
        for(int i=0;i<res.size();i++){
            array2D[i][0]=res.get(i).get(0);
            array2D[i][1]=res.get(i).get(1);
        }
        return array2D;
    }
}
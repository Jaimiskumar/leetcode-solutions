class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tg=0;
        int tc=0;
        int tank=0;
        int start=0;
        for(int i=0;i<gas.length;i++){
            tg=tg+gas[i];
            tc=tc+cost[i];
            tank=tank+gas[i]-cost[i];
            if(tank<0){
                start=i+1;
                tank=0;
            }
        }
        if(tg<tc){
            return -1;
        }
        return start;
    }
}
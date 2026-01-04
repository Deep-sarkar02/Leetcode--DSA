class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
         // code here
        int tg = 0;
        int tc = 0;
        // find the tg and tc
        for(int i = 0 ; i <gas.length; i++)
        {
            tg += gas[i];
            tc += cost[i];
        }
        // impossible case
        if(tg <tc ) return -1;
        int CI = 0 ;
        int SI = 0;
        for(int i = 0 ; i <gas.length ; i++)
        {
            CI += gas[i] - cost[i];
            if(CI <0)
            {
                SI  = i+1;
                CI = 0;
            }
        }
        return SI;
    }
}
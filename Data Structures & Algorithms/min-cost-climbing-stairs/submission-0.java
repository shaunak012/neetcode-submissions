class Solution {
    public int minCostClimbingStairsHelper(int[] cost,int i) {
        if(i>=cost.length) return 0;
        return cost[i]+Math.min(minCostClimbingStairsHelper(cost,i+1),minCostClimbingStairsHelper(cost,i+2));
    }
    public int minCostClimbingStairs(int[] cost) {
        return Math.min(minCostClimbingStairsHelper(cost,0),minCostClimbingStairsHelper(cost,1));
    }
}

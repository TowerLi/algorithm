package com.kimsohyun.xyz;


public class Day20200609 {
    /**
     * 746. 使用最小花费爬楼梯
     * 数组的每个索引作为一个阶梯，第 i个阶梯对应着一个非负数的体力花费值 cost[i](索引从0开始)。
     *
     * 每当你爬上一个阶梯你都要花费对应的体力花费值，然后你可以选择继续爬一个阶梯或者爬两个阶梯。
     *
     * 您需要找到达到楼层顶部的最低花费。在开始时，你可以选择从索引为 0 或 1 的元素作为初始阶梯。
     *
     * 示例 1:
     *
     * 输入: cost = [10, 15, 20]
     * 输出: 15
     * 解释: 最低花费是从cost[1]开始，然后走两步即可到阶梯顶，一共花费15。
     *  示例 2:
     *
     * 输入: cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
     * 输出: 6
     * 解释: 最低花费方式是从cost[0]开始，逐个经过那些1，跳过cost[3]，一共花费6。
     * 注意：
     *
     * cost 的长度将会在 [2, 1000]。
     * 每一个 cost[i] 将会是一个Integer类型，范围为 [0, 999]。
     * @param cost
     * @return
     */
    public int minCostClimbingStairs(int[] cost) {
        //从前往后推
        //求出 f(cost.length+1)
        // f[i] = cost[i] + min(f[i-1],f[i-2])
        int cost1 = 0,cost2 = 0;
        for (int i = 0;i < cost.length;i++) {
            int cur = cost[i] + Math.min(cost1,cost2);
            cost1 = cost2;
            cost2 = cur;
        }
        return Math.min(cost1,cost2);
    }

    public static void main(String[] args) {
        Day20200609 d9 = new Day20200609();
        int[] cost = {10,15,20};
        int[] cost2 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int ans = d9.minCostClimbingStairs(cost2);
        System.out.println("ans is :");
        System.out.println(ans);
    }
}

// https://leetcode.com/problems/richest-customer-wealth/

public class MaximumWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                { 1, 2, 3 },
                { 3, 2, 1 },
                { 4, 5, 6 }
        };
        System.out.println(maximumWealth(accounts)); // 15
    }

    public static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;

        for (int[] customer : accounts) {
            int wealth = 0;

            for (int bank : customer) {
                wealth += bank;
            }

            max = Math.max(wealth, max);
        }
        return max;
    }
}

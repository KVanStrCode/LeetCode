// https://leetcode.com/problems/running-sum-of-1d-array/

public class RunningSum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int[] result = runningSum2(arr);

        for (int i = 0; i < result.length; i++) { // [1, 3, 6, 10]
            System.out.println(result[i]);
        }
    }

    public static int[] runningSum1(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }
        return nums;
    }

    public static int[] runningSum2(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];
        }
        return result;
    }
}
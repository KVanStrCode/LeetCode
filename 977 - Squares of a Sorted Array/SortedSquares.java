// https://leetcode.com/problems/squares-of-a-sorted-array/

public class SortedSquares {
    public static void main(String[] args) {
        int[] arr = sortedSquares(new int[] { -4, -1, 0, 3, 10 });
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;

        for (int i = nums.length - 1; i > -1; i--) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[i] = nums[left] * nums[left];
                left++;
            } else {
                result[i] = nums[right] * nums[right];
                right--;
            }
        }

        return result;
    }
}

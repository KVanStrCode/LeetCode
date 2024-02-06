// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

public class FindNumbers {
    public static void main(String[] args) {
        System.out.println(findNumbers(new int[] { 14, 3, 26, 12 }));
    }

    public static int findNumbers(int[] nums) {
        int evenNumbers = 0;

        for (int n : nums) {
            int digitCount = 0;

            while (n != 0) {
                n /= 10;
                digitCount++;
            }

            if (digitCount % 2 == 0) {
                evenNumbers++;
            }
        }

        return evenNumbers;
    }
}
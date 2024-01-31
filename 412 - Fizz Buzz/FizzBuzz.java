// https://leetcode.com/problems/fizz-buzz/description/

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }

    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            String currentString = "";

            if (divisibleBy3) {
                currentString += "Fizz";
            }

            if (divisibleBy5) {
                currentString += "Buzz";
            }

            if (currentString.isEmpty()) {
                currentString = String.valueOf(i);
            }

            result.add(currentString);
        }
        return result;
    }
}
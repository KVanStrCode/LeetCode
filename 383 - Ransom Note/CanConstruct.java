// https://leetcode.com/problems/ransom-note/description/

import java.util.HashMap;
import java.util.Map;

public class CanConstruct {
    public static void main(String[] args) {
        System.out.println(canConstruct2("ransom", "random"));
    }

    public static boolean canConstruct1(String ransomNote, String magazine) {
        for (int i = 0; i < ransomNote.length(); i++) {
            char r = ransomNote.charAt(i);

            int matchingIndex = magazine.indexOf(r);

            if (matchingIndex == -1) {
                return false;
            }

            magazine = magazine.substring(0, matchingIndex) + magazine.substring(matchingIndex + 1);
        }

        return true;
    }

    public static boolean canConstruct2(String ransomNote, String magazine) {
        Map<Character, Integer> magazineMap = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            if (!magazineMap.containsKey(c)) {
                return false;
            }

            if (magazineMap.get(c) < 1) {
                return false;
            }

            magazineMap.put(c, magazineMap.get(c) - 1);
        }

        return true;
    }
}

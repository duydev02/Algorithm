package codethieunhi.validanagram;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public static boolean isAnagram(String s, String t) {
        if (s == null || t == null) return false;
        if (s.length() != t.length()) return false;
        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for (int i : counter) {
            if (i != 0) return false;
        }
        return true;
    }

    public static boolean isAnagramSortedString(String s, String t) {
        char[] stringSToChar = s.toCharArray();
        Arrays.sort(stringSToChar);
        String sortedStringS = new String(stringSToChar);
        char[] stringTToChar = s.toCharArray();
        Arrays.sort(stringTToChar);
        String sortedStringT = new String(stringTToChar);
        if (!sortedStringS.equals(sortedStringT)) return false;
        return true;
    }

    public static boolean isAnagramHashMap(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        if (s.length() != t.length()) return false;
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (char c : t.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
                if (map.get(c) == 0) map.remove(c);
            }
        }
        return map.isEmpty();
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaramz";
        System.out.println(isAnagram(s, t));
        System.out.println(isAnagramSortedString(s, t));
        System.out.println(isAnagramHashMap(s, t));
    }
}

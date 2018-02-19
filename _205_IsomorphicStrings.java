package leetcode;

import java.util.HashMap;

/**
 * Project Name : Leetcode
 * Package Name : leetcode
 * File Name : _205_IsomorphicStrings
 * Creator : Edward
 * Date : Oct, 2017
 * Description : 205. Isomorphic Strings
 */
public class _205_IsomorphicStrings {
    /**
     Given two strings s and t, determine if they are isomorphic.

     Two strings are isomorphic if the characters in s can be replaced to get t.

     All occurrences of a character must be replaced with another character while preserving
     the order of characters. No two characters may map to the same character but a character may map to itself.

     For example,
     Given "egg", "add", return true.

     Given "foo", "bar", return false.

     Given "paper", "title", return true.

     题意：
     求s和t是否为同构字符串，就是说原字符串中的每个字符可由另外一个字符替代，可以被其本身替代，相同的字符一定要被同一个字符替代，
     且一个字符不能被多个字符替代，即不能出现一对多的映射。

     思路：
     方法1: 用hashmap建立两个string相同位上的char的一一映射,一旦对应位不同便返回false。
            这里要注意,当map不包含s当前位对应的字符时,我们也必须要保证t当前位所对应的字符也没有被其他映射所包含。

     方法2: 开两个256的char数组, 分别统计对应字符串的char个数是否相同

     复杂度：
     time : O(n);
     space : O(n);

     * @param s
     * @param t
     * @return
     */

    // time : O(n) space : O(n)
    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null) return true;
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if (map.containsKey(a)) {
                if (map.get(a).equals(b)) continue;
                else return false;
            } else {
                if (!map.containsValue(b)) {
                    map.put(a, b);
                } else return false;
            }
        }
        return true;
    }


    // time : O(n) space : O(1)
    public boolean isIsomorphic2(String s, String t) {
        int[] sChars = new int[256];
        int[] tChars = new int[256];

        for (int i = 0; i < s.length(); i++) {
            if (sChars[s.charAt(i)] != tChars[t.charAt(i)]) {
                return false;
            } else {
                sChars[s.charAt(i)] = tChars[t.charAt(i)] = t.charAt(i);
            }
        }
        return true;
    }
}

package leetcode;

/**
 * Project Name : Leetcode
 * Package Name : leetcode
 * File Name : LongestCommonPrefix
 * Creator : Edward
 * Date : 09/2017
 * Description : 14. LongestCommonPrefix
 */
public class _014_LongestCommonPrefix {
    /**
     Longest Common Prefix
     Write a function to find the longest common prefix string amongst an array of strings.

     题意：
         寻找一个字符串数组中的最长公共前缀。

     思路：
         1. 取第一个string作为参照物,因为最长公共前缀一定不会超过第一个字符串的长度。
         2. 遍历每一个strs中的string,不断的尝试直到找到前i个string的最长公共前缀。

     复杂度：
         time : O(n*m), m为第一个string的长度, 也可预处理找到最短的string长度,这样m就是Math.min(str.length() in strs)
         space : O(1)

     * @param strs
     * @return
     */
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String res = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(res) != 0) {
                res = res.substring(0, res.length() - 1);
            }
        }
        return res;
    }
}

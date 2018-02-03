package leetcode;

/**
 * Project Name : Leetcode
 * Package Name : leetcode
 * File Name : FirstUniqueCharacterinaString
 * Creator : Edward
 * Date : Oct, 2017
 * Description : 387. First Unique Character in a String
 */
public class _387_FirstUniqueCharacterinaString {
    /**
     Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
     Examples:

     s = "leetcode"
     return 0.

     s = "loveleetcode",
     return 2.
     Note: You may assume the string contain only lowercase letters.

     题意：
         求一个string中第一个没有重复的字符

     思路：
         1. 因为只包含小写字母,所以开一个26位长的int数组
         2. 统计每一个字符的个数
         3. 再遍历一遍string, 当遇到某位字符对应统计频率为1,输出该字符

     复杂度：
         time : O(n);
         space : O(1);

     * @param s
     * @return
     */
    public int firstUniqChar(String s) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}

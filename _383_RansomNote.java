package leetcode;

/**
 * Project Name : Leetcode
 * Package Name : leetcode
 * File Name : RansomNote
 * Creator : Edward
 * Date : Dec, 2017
 * Description : 383. Ransom Note
 */
public class _038_RansomNote {
    /**
     Given an arbitrary ransom note string and another string containing letters from all the magazines,
     write a function that will return true if the ransom note can be constructed from the magazines ;
     otherwise, it will return false.
     Each letter in the magazine string can only be used once in your ransom note.

     You may assume that both strings contain only lowercase letters.

     canConstruct("a", "b") -> false
     canConstruct("aa", "ab") -> false
     canConstruct("aa", "aab") -> true

     题意：
         给定两个字符串magazines和ransomNote，问是否可以从magazines中抽取字母（每个字母只能用一次）组成ransomNote

     思路：
         1. 构建magazine的字母表int[] count
         2. 遍历ransomNote，保证有足够的字母可用

     复杂度：
         time : O(n)
         space : O(1)

     * @param ransomNote
     * @param magazine
     * @return
     */
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            count[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (--count[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}

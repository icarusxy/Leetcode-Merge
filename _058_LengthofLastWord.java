package leetcode;

/**
 * Project Name : Leetcode
 * Package Name : leetcode
 * File Name : LengthofLastWord
 * Creator : Edward
 * Date : Oct, 2017
 * Description : 58. Length of Last Word
 */
public class _058_LengthofLastWord {
    /**
     Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
     If the last word does not exist, return 0.
     Note: A word is defined as a character sequence consists of non-space characters only.
     For example,
     Given s = "Hello World",
     return 5.

     题意：
         求一个string的最后一个单词的长度,这个string由大小写字母加空格组成

     思路：
         1. 去掉首位多余的空格
         2. 找到string中最后一个空格的位置
         3. 用(string的总长度 - 1) - 最后一个空格的位置, 就为要求的word length。

     复杂度：
         time : O(1)
         space : O(1)

     * @param s
     * @return
     */
    public int lengthOfLastWord(String s) {
        return s.trim().length() - s.trim().lastIndexOf(" ") - 1;
    }
}


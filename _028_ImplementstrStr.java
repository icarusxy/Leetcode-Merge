package leetcode;

/**
 * Project Name : Leetcode
 * Package Name : leetcode
 * File Name : ImplementstrStr
 * Creator : Edward
 * Date : Sep, 2017
 * Description : 28. ImplementstrStr
 */
public class _028_ImplementstrStr {
    /**
     Implement strStr().
     Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

     题意：
         判断一个字符串是否是另一个字符串的子串。

     思路：
         设n = haystack.length(), m = needle.length(), 对原串的每一个长度为m的字串都判断是否跟匹配串一致。

         这个题目最经典的算法应该是KMP算法, 但是KMP算法比较复杂，很难在面试的短时间里面完整正确的实现。
         所以一般在面试中并不要求实现KMP算法。

     复杂度：
         time : O(n*m), 一共是(n - m + 1)个子串，所以算法时间复杂度为O((n-m+1)*m)=O(n*m)
         space : O(1)

     * @param haystack
     * @param needle
     * @return
     */
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}

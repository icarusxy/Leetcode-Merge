package leetcode;

/**
 * Project Name : Leetcode
 * Package Name : leetcode
 * File Name : _344_ReverseString
 * Creator : Edward
 * Date : July, 2017
 * Description : 344. ImplementstrStr
 */
public class _344_ReverseString {
    /**
     * 344. Reverse String
     * Write a function that takes a string as input and returns the string reversed.

     Example:
     Given s = "hello", return "olleh".

     题意：
     字符串反转输出.

     思路：
     双指针, 将string转换成char[] 数组, 然后不断将首位字符交换即可。

     复杂度：
     time : O(n);
     space : O(n);

     * @param s
     * @return
     */
    public static String reverseString(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        int left = 0;
        int right = s.length() - 1;
        char[] str = s.toCharArray();
        while (left < right) {
            char temp = str[left];
            str[left++] = str[right];
            str[right--] = temp;
        }
        return new String(str);
    }
}

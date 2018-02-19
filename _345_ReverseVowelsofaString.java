package leetcode;

/**
 * Project Name : Leetcode
 * Package Name : leetcode
 * File Name : _345_ReverseVowelsofaString
 * Creator : Edward
 * Date : Sep, 2017
 * Description : TODO
 */
public class _345_ReverseVowelsofaString {
    /**
     * 345. Reverse Vowels of a String
     * Write a function that takes a string as input and reverse only the vowels of a string.

     Example 1:
     Given s = "hello", return "holle".

     Example 2:
     Given s = "leetcode", return "leotcede".


     题意：
     给一个英文字串，将里面的母音字母反转。

     思路：
     双指针, 每次头尾分别找到第一个在vowels里的字符,然后将二者进行反转。

     复杂度：
     time : O(n);
     space : O(n);

     * @param s
     * @return
     */
    public String reverseVowels(String s) {
        if (s == null || s.length() == 0) return s;
        String vowels = "aeiouAEIOU";
        char[] array = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            while (start < end && vowels.indexOf(array[start]) == -1) {
                start++;
            }
            while (start < end && vowels.indexOf(array[end]) == -1) {
                end--;
            }
            char temp = array[start];
            array[start++] = array[end];
            array[end--] = temp;
        }
        return String.valueOf(array);
    }
}

package leetcode;

/**
 * Project Name : Leetcode
 * Package Name : leetcode
 * File Name : _186_ReverseWordsinaStringII
 * Creator : Edward
 * Date : Sep, 2017
 * Description : TODO
 */
public class _186_ReverseWordsinaStringII {
    /**
     * 186. Reverse Words in a String II
     * For example,
     Given s = "the sky is blue",
     return "blue is sky the"

     题意：
     反转字符串中的单词

     思路：
     这里要求你不能使用额外的space,所以我们先将整个string反转一遍,再按单个单词进行反转.

     复杂度：
     time : O(n);
     space : O(1);

     * @param str
     */
    public void reverseWords(char[] str) {
        reverse(str, 0, str.length - 1);
        int r = 0;
        while (r < str.length) {
            int l = r;
            while (r < str.length && str[r] != ' ') {
                r++;
            }
            reverse(str, l, r - 1);
            r++;
        }
    }

    private void reverse(char[] s, int i, int j) {
        while (i < j) {
            char temp = s[i];
            s[i++] = s[j];
            s[j--] = temp;
        }
    }
}

package leetcode;

/**
 * Project Name : Leetcode
 * Package Name : leetcode
 * File Name : _151_ReverseWordsinaString
 * Creator : Edward
 * Date : Sep, 2017
 * Description : TODO
 */
public class _151_ReverseWordsinaString {
    /**
     * 151. Reverse Words in a String
     * For example,
     Given s = "the sky is blue",
     return "blue is sky the".

     题意：
     反转字符串中的单词

     思路：
     方法1: 首先将字符串按空格拆分为包含单个单词的字符串数组, 然后倒序对数组中的每个单词进行反转。

     方法2: 首先将字符串整体进行反转, 然后再按每个单词进行反转, 最后去掉多余的空格。

     这里的“\\s+”:
     正则表达式中\s匹配任何空白字符，包括空格、制表符、换页符等等, 等价于[\f\n\r\t\v]
     \f -> 匹配一个换页
     \n -> 匹配一个换行符
     \r -> 匹配一个回车符
     \t -> 匹配一个制表符
     \v -> 匹配一个垂直制表符
     而“\s+”则表示匹配任意多个上面的字符。另因为反斜杠在Java里是转义字符，所以在Java里，我们要这么用“\\s+”.

     复杂度：
     time : O(n);
     space : O(n);

     * @param s
     * @return
     */

    //time : O(n), space : O(n)
    public String reverseWords(String s) {
        if (s == null || s.length() == 0) return s;
        StringBuilder sb = new StringBuilder();
        String[] words = s.trim().split("\\s+");
        for (int i = words.length - 1; i >=0; i--) {
            sb.append(words[i] + " ");
        }
        return sb.toString().trim();
    }

    // time : O(n) space : O(n)
    public String reverseWords2(String s) {
        if (s == null || s.length() == 0) return s;
        char[] ch = s.toCharArray();
        reverse(ch, 0, s.length() - 1);
        reverseWord(ch, s.length());
        return cleanSpaces(ch, s.length());
    }

    private void reverse(char[] ch, int i, int j) {
        while (i < j) {
            char temp = ch[i];
            ch[i++] = ch[j];
            ch[j--] = temp;
        }
    }
    private void reverseWord(char[] ch, int len) {
        int i = 0;
        int j = 0;
        while (i < len) {
            while (i < j || i < len && ch[i] == ' ') i++;
            while (j < i || j < len && ch[j] != ' ') j++;
            reverse(ch, i, j - 1);
        }
    }
    private String cleanSpaces(char[] ch, int len) {
        int i = 0;
        int j = 0;
        while (j < len) {
            while (j < len && ch[j] == ' ') j++;
            while (j < len && ch[j] != ' ') ch[i++] = ch[j++];
            while (j < len && ch[j] == ' ') j++;
            if (j < len) ch[i++] = ' ';
        }
        return String.valueOf(ch).substring(0, i);
    }
}

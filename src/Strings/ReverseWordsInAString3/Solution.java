package Strings.ReverseWordsInAString3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {

    public String reverseWords(String s) {

        String[] split = s.split(" ");
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < split.length; i++) {

            split[i] = reverseWordPerElement(split[i]);
            ans.append(split[i]);
            ans.append(" ");
        }

        return ans.toString().trim();
    }

    public String reverseWordPerElement(String s) {

        char[] word = s.toCharArray();

        for (int i = 0, j = word.length - 1; i < j; i++, j--) {

            char temp = word[i];
            word[i] = word[j];
            word[j] = temp;
        }
        return String.valueOf(word);
    }

/*    String[] split = s.split(" ");
    StringBuilder ans = new StringBuilder();

        for (String value : split) {

        StringBuilder word = new StringBuilder(value);
        ans.append(word.reverse()).append(" ");
    }
        return ans.toString().trim();*/

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.reverseWords("God Ding"));
    }
}

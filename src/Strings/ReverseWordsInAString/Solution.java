package Strings.ReverseWordsInAString;

import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String reverseWords(String s) {

        String[] split = s.trim().split("\\s+"); // this regex works for multiple spaces, if it's just one then use " ". trim is for cutting any leading or trailing spaces
        StringBuilder result = new StringBuilder();

        for (int i = 0, j = split.length - 1; i < j; i++, j--) {

            String temp = split[j];
            split[j] = split[i];
            split[i] = temp;
        }

        for (String word : split) {

            result.append(word);
            result.append(" ");
        }

        return result.toString().trim();
    }

      /*String[] words = s.trim().split(" +");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);*/

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.reverseWords("the sky is blue"));
    }
}

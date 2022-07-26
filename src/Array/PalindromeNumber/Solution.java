package Array.PalindromeNumber;

import java.util.Scanner;
class Solution {
    public boolean isPalindrome(int x) {
        String before = String.valueOf(x);
        StringBuilder after = new StringBuilder();

        for (int i = before.length() - 1; i >= 0; i--) {
            after.append(before.charAt(i));
        }

        return before.equals(after.toString());
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        scan.close();

        System.out.println(s.isPalindrome(input));
    }
}

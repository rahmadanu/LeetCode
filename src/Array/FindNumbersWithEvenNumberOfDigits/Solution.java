package Array.FindNumbersWithEvenNumberOfDigits;

class Solution {
    public int findNumbers(int[] nums) {

        int even = 0;
        int digit = 0;

        for (int num : nums) {

            while (num > 0) {
                num /= 10;
                digit++;
            }

            if (digit % 2 == 0) {
                even++;
            }

            digit = 0;
        }

        return even;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.findNumbers(new int[] {12,34,3433,62,7896}));
    }
}

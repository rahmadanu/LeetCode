package Array.SquaresOfASortedArray;

import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {

        int temp;

        for (int i = 0; i < nums.length; i++) {

            nums[i] *= nums[i];
        }

        System.out.println(Arrays.toString(nums));

        for (int i = 1; i < nums.length; i++) {

            for (int j = i; j > 0; j--) {
                System.out.println(" i: " + i + ", j: " + j + ", j-1: " + (j-1) + " " + Arrays.toString(nums));

                if (nums[j] < nums[j - 1]) {

                    temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(Arrays.toString(obj.sortedSquares(new int[] {-5,-3,-2,-1})));
    }
}

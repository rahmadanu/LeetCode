package Array.SquaresOfASortedArray;

import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {

        int first = 0;
        int last = nums.length-1;
        int index = nums.length-1; // this starts from last index because we want to fill the higher value to the last index of result[]

        int[] result = new int[nums.length];

        System.out.println(Arrays.toString(nums));

        while (first <= last) {

            if (Math.abs(nums[first]) > Math.abs(nums[last])) { // comparing values to get and add the higher one to the new array result[]
                result[index] = nums[first] * nums[first]; // add squared of nums[first] to result[index]
                first++;
            } else {
                result[index] = nums[last] * nums[last]; // add squared of nums[last] to result[index]
                last--;
            }
            index--; // move to the next index with decreasing order (last to first)
        }

        return result;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(Arrays.toString(obj.sortedSquares(new int[] {-5,-3,-2,-1})));
    }
}

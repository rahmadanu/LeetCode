package Array.FindPivotIndex;

import java.util.Arrays;

class Solution {
    public int pivotIndex(int[] nums) { // says input [1, 2, 1]

        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        leftSum[0] = nums[0];
        rightSum[nums.length - 1] = nums[nums.length - 1];

        for (int i = 1; i < nums.length; i++) {

            leftSum[i] = nums[i] + leftSum[i-1]; // [1, 3, 4]
            rightSum[nums.length - 1 - i] = nums[nums.length - 1 - i] + rightSum[nums.length-1]; // [4, 3, 1]
        }

        System.out.println(Arrays.toString(leftSum));
        System.out.println(Arrays.toString(rightSum));

        for (int i = 0; i < nums.length; i++) {

            if (leftSum[i] == rightSum[i]) {
                return i; // return index 1 which has value 3
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.pivotIndex(new int[]{1, 2, 1}));
    }
}

package Array.FindPivotIndex;

import java.util.Arrays;

class Solution {
    public int pivotIndex(int[] nums) {

        int sum = 0, left = 0;

        for (int num : nums) {

            sum += num;
        }
        System.out.println("sum: " + sum);

        for (int i = 0; i < nums.length; i++) {

            sum -= nums[i];

            if (sum == left) {
                return i;
            }
            left += nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.pivotIndex(new int[]{1, 2, 3, 2, 1}));
    }
}

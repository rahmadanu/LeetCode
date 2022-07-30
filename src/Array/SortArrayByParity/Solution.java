package Array.SortArrayByParity;

import java.util.Arrays;

class Solution {
    public int[] sortArrayByParity(int[] nums) {

        if (nums == null && nums.length == 0) return null;

        int k = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 2 == 0) {
                System.out.println(Arrays.toString(nums));
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k++] = temp;
            }  //input containing [2, 2, 2] will run in loop which is unnecessary to swap, will fix later
        }

        return nums;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(Arrays.toString(obj.sortArrayByParity(new int[] {2, 3, 2})));
    }
}

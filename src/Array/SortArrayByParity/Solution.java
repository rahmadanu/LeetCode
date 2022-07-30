package Array.SortArrayByParity;

import java.util.Arrays;

class Solution {
    public int[] sortArrayByParity(int[] nums) {

        int k = 0, odd = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k++] = temp;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(Arrays.toString(obj.sortArrayByParity(new int[] {3,1,2,4})));
    }
}

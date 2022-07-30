package Array.RemoveDuplicatesFromSortedArray;

import java.lang.reflect.Array;
import java.util.Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {
        System.out.println(Arrays.toString(nums));
        System.out.println();
        if (nums == null || nums.length == 0) return 0;

        int k = 0;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i - 1]) {

                nums[++k] = nums[i];
                System.out.println(Arrays.toString(nums));
            }
        }

        System.out.println();
        System.out.println(Arrays.toString(nums));
        return k;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.removeDuplicates(new int[]{0,0,2,2,2,2,2,3,3,4}));
    }
}

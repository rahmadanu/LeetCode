package Array.ContainsDuplicate;

import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean result = false;

        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {

            if (nums[i - 1] == nums[i]) {
                result = true;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.containsDuplicate(new int[] {1, 2, 3, 1}));
    }
}
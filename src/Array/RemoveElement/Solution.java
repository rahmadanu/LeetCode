package Array.RemoveElement;

import java.util.Arrays;

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                nums[k++] = nums[i];
            }

            /*
            if (nums[i] == val) {
                k++;
            } else {
                int temp = nums[i];
                nums[i] = 0;
                nums[i - k] = temp;
            }
            */
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }
}

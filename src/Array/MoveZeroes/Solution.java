package Array.MoveZeroes;

import java.util.Arrays;

class Solution {

    public int[] moveZeroes(int[] nums) {
        System.out.println("Size: " + nums.length);
        System.out.println("Before: " + Arrays.toString(nums));

        //int countZero = 0,
        int index = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }

        while (index < nums.length) {
            nums[index++] = 0;
        }


/* Solution 2
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                countZero++;
            } else if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = 0;
                nums[i - countZero] = temp;
            }

        }
*/

/* Solution 3
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            } else if (nums[i] == 0) {
                countZero++;
            }
        }

        for (int i = nums.length - 1; i >= nums.length - countZero; i--) {
            nums[i] = 0;
        }
*/

        return nums;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println("After: " + Arrays.toString(obj.moveZeroes(new int[]{0, 1, 0, 12})));
    }
}

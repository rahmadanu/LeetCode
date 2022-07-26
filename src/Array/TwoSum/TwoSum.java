package Array.TwoSum;

import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int index = 0;
        int x = nums[index];
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (target - nums[i] == x) {
                result[0] = index;
                result[1] = i;
            }
            index++;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}

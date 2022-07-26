package Array.TwoSum;

import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < i; j++) {
                if (nums[i] + nums[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return null;

        //will use hashmap soon
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}
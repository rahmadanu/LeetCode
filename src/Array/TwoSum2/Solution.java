package Array.TwoSum2;

import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while (left < numbers.length && right > 0) {

            int sum = numbers[left] + numbers[right];

            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                return new int[]{left + 1, right + 1};
            }

        }
        return new int[] {};
    }
/*        //Brute force approach
        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers.length; j++) {

                if (numbers[i] + numbers[j] == target && i != j) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return new int[] {};*/

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(Arrays.toString(obj.twoSum(new int[] {2, 3, 4}, 6)));
    }
}

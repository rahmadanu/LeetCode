package Array.ArrayPartition1;

import java.lang.reflect.Array;
import java.util.Arrays;

class Solution {
    public int arrayPairSum(int[] nums) {

        int sum = 0;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i += 2) {

            sum += nums[i];
        }

        /* or for (int i = 1; i < nums.length; i = i + 2) {

            sum += Math.min(nums[i-1], nums[i]);
        }*/

        return sum;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.arrayPairSum(new int[] {1, 4, 3, 2}));
    }
}

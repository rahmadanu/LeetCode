package Array.RotateArray;

import java.util.Arrays;

class Solution {
    public void rotate(int[] nums, int k) {

        System.out.println(Arrays.toString(nums));

        int left = 0;
        int right = nums.length - 1;

        if (k > nums.length) k = k % nums.length;

        swap(left, right, nums);
        swap(left, k-1, nums);
        swap(k, right, nums);
    }

    public static void swap(int start, int end, int nums[]) {

        while (start < end) {
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start++;
            end--;

            System.out.println(Arrays.toString(nums));
        }
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        obj.rotate(new int[] {-1}, 3);
    }
}

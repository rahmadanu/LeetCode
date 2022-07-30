package Array.ValidMountainArray;

import java.util.Arrays;

class Solution {
    public boolean validMountainArray(int[] arr) {

        if (arr == null || arr.length == 0) return false;

        int left = 0, right = arr.length - 1;

        if (arr.length < 3) return false;

        while (left < arr.length-1 && arr[left] < arr[left + 1]) {
            left++;
        }

        while (right > 0 && arr[right] < arr[right - 1]) {
            right--;
        }

        return left == right && left > 0 && right < arr.length-1;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.validMountainArray(new int[] {1, 2, 3, 6, 5, 2}));
    }
}

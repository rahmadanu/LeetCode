package Array.MergeSortedArray;

import java.lang.reflect.Array;
import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = 0, j = 0, k = 0;
        int[] nums3 = new int[m + n];

        //Forward
        while (i < m && j < n) {

            if (nums1[i] < nums2[j]) {
                nums3[k++] = nums1[i++];
            } else {
                nums3[k++] = nums2[j++];
            }
            System.out.println(Arrays.toString(nums3));
        }

        while (i < m) {
            nums3[k++] = nums1[i++];
            System.out.println(Arrays.toString(nums3));
        }

        while (j < n) {
            nums3[k++] = nums2[j++];
            System.out.println(Arrays.toString(nums3));
        }

        /* Backward
        int i = m-1, j = n-1, k = m + n -1;
        int[] nums3 = new int[m + n];

        while (i >= 0 && j >= 0) {

            if (nums1[i] > nums2[j]) {
                nums3[k--] = nums1[i--];
            } else {
                nums3[k--] = nums2[j--];
            }
        }

        while (i >= 0) {
            nums3[k--] = nums1[i--];
        }
        while (j >= 0) {
            nums3[k--] = nums2[j--];
        }
*/
        System.out.println(Arrays.toString(nums3));
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        obj.merge(new int[] {1, 2, 3}, 3, new int[] {2, 5, 6}, 3);
    }
}
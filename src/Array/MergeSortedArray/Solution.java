package Array.MergeSortedArray;

import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = 0, j = 0, k = 0;

        int[] nums3 = new int[50];

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] < nums2[j]) {
                nums3[k++] = nums1[i++];
            } else if (nums1[i] > nums2[j]) {
                nums3[k++] = nums2[j++];
            }
        }

        while (i < nums1.length) {
            nums3[k++] = nums1[i++];
        }

        while (j < nums2.length) {
            nums3[k++] = nums2[j++];
        }

        System.out.println(Arrays.toString(nums3));
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        obj.merge(new int[] {1, 2, 3}, 3, new int[] {2, 5, 6}, 3);
    }
}
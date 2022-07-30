package Array.ReplaceElements;

import java.util.Arrays;

class Solution {
    public int[] replaceElements(int[] arr) {

        if (arr == null || arr.length == 0) return null;


        //Brute-force approach
        int greatest = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                greatest = Math.max(greatest, arr[j]);
                arr[i] = greatest;
            }
            greatest = 0;
        }

        arr[arr.length-1] = -1;

        return arr;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(Arrays.toString(obj.replaceElements(new int[] {17,18,5,4,6,1})));
    }
}

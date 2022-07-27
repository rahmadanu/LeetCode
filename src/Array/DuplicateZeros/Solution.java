package Array.DuplicateZeros;

import java.util.Arrays;

class Solution {
    public void duplicateZeros(int[] arr) { // will use queue later
        System.out.println(Arrays.toString(arr));

        if (arr == null || arr.length == 0) return;

/*      Brute force approach

        for (int i = 0; i < arr.length; i++) {
            System.out.println("i in first loop: " + i);
            if (arr[i] == 0) {

                for (int j = arr.length - 1; j > i; j--) {
                    arr[j] = arr[j-1];
                    System.out.println(Arrays.toString(arr));
                }
                i++;
                System.out.println("i in if: " + i);
            }
        }
*/

        //Optimized solution
        int i = 0, shift = 0;

        for (i = 0; shift + i < arr.length; ++i) {

            if (arr[i] == 0) {
                shift++;
            }
        }

        for (i = i - 1; shift > 0; --i) {
            if (i + shift < arr.length) {
                System.out.println("!0: " + Arrays.toString(arr));
                arr[i + shift] = arr[i];
            }

            if (arr[i] == 0) {
                System.out.println("0: " + Arrays.toString(arr));
                shift--;
                arr[i + shift] = arr[i];
            }
            System.out.println("shift: " + shift + " ,i: " + i + ", shift+i: " + (shift+ i));
        }

        System.out.println(Arrays.toString(arr));

    }


    public static void main(String[] args) {
        Solution obj = new Solution();
        obj.duplicateZeros(new int[] {1,0,2,3,0,4,5,0});
    }
}
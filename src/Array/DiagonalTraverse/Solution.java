package Array.DiagonalTraverse;

import java.util.Arrays;

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {

        int[] result = new int[mat.length * mat.length];

        return result;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(Arrays.toString(obj.findDiagonalOrder(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})));
    }
}

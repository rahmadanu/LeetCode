package Array.HeightChecker;

import java.lang.reflect.Array;
import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) {

        if (heights == null || heights.length == 0) return 0;

        int count = 0;

        int[] expected = heights.clone();

        Arrays.sort(expected);

        for (int i = 0; i < heights.length; i++){

            if (heights[i] != expected[i]) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.heightChecker(new int[] {1,1,4,2,1,3}));
    }
}

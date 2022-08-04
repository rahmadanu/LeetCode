package Array.ThirdMaximumNumber;

import java.util.Arrays;

class Solution {
    public int thirdMax(int[] nums) {

        if (nums == null || nums.length == 0) return 0;

        Integer maxFirst = null, maxSecond = null, maxThird = null;

        for (Integer num : nums) {

            if (num.equals(maxFirst) || num.equals(maxSecond) || num.equals(maxThird)) continue;

            if (maxFirst == null || num > maxFirst) {
                maxThird = maxSecond;
                maxSecond = maxFirst;
                maxFirst = num;
            } else if (maxSecond == null || num > maxSecond) {
                maxThird = maxSecond;
                maxSecond = num;
            } else if(maxThird == null || num > maxThird) {
                maxThird = num;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println("maxfirst: " + maxFirst + ", maxsecond: " + maxSecond + " maxthird: " +  maxThird);

        return maxThird == null ? maxFirst : maxThird;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.thirdMax(new int[] {1,-2147483648,2}));
    }
}

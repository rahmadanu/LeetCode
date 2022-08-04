package Array.LargestNumberAtLeastTwiceofOthers;

class Solution {
    public int dominantIndex(int[] nums) {

        int max = 0, indexOfLargest = 0;

        for (int j : nums) {
            max = Math.max(max, j);
        }
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == max) indexOfLargest = i;
        }

        for (int num : nums) {

            if (num * 2 > max && num != max) {
                indexOfLargest = -1;
                break;
            }
        }
        return indexOfLargest;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.dominantIndex(new int[] {1,2,3,4}));
    }
}

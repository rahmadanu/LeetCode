package Array.LargestNumberAtLeastTwiceofOthers;

class Solution {
    public int dominantIndex(int[] nums) {

        int max = -1, indexOfLargest = -1, secondLargest = -1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > max) {
                secondLargest = max;
                max = nums[i];
                indexOfLargest = i;
            } else if (nums[i] > secondLargest) {
                secondLargest = nums[i];
            }
        }

        return secondLargest * 2 <= max ? indexOfLargest : -1;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.dominantIndex(new int[] {0, 0, 0, 2}));
    }
}

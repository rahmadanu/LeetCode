package Array.FindAllNumbersDisappearedinanArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> result = new ArrayList<>();
        List<Integer> disappeared = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            result.add(i + 1);
        }

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                continue;
            }
            if (nums[i-1] != result.get(i-1)) {
                disappeared.add(result.get(i-1));
            }
        }

        return disappeared;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.findDisappearedNumbers(new int[] {4,3,2,7,8,2,3,1}));
    }
}

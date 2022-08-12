package Array.SingleNumber;

class Solution {
    public int singleNumber(int[] nums) {

        int singleOne = 0;

        for (int num : nums) {
            singleOne ^= num;
        }

        return singleOne;
    }


    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.singleNumber(new int[] {4,1,2,1,2}));
    }
}

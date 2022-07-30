package Array.CheckIfNandItsDoubleExist;

class Solution {
    public boolean checkIfExist(int[] arr) {

        if (arr == null || arr.length == 0) return false;

        //Brute-force approach O(n^2)
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if (i != j) {

                    if (arr[j] * 2 == arr[i]) {

                        return true;
                    }
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.checkIfExist(new int[] {0,0}));
    }
}

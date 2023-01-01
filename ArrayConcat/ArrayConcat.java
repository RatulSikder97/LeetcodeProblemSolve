package ArrayConcat;

public class ArrayConcat {
    class Solution {
        public int[] getConcatenation(int[] nums) {
            int[] ans = new int[2*nums.length];

            for(int i=0;i<nums.length;i++) {
                ans[i] = ans[arrLen+i] = nums[i];
            }

            return ans;
        }
    }
}

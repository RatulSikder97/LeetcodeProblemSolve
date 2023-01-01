package ArrayConcat;

public class ArrayConcat {
    class Solution {
        public int[] getConcatenation(int[] nums) {
            int arrLen = nums.length;
            int[] ans = new int[2*arrLen];

            for(int i=0;i<arrLen;i++) {
                ans[i] = nums[i];
                ans[arrLen+i] = nums[i];
            }

            return ans;
        }
    }
}

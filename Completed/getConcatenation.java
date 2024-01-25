package Completed;

import java.util.Arrays;

public class getConcatenation {

    /* Leetcode Question Number - 1929 */

    /**
     * Given an integer array nums of length n, you want to create an array ans of
     * length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n
     * (0-indexed).
     * 
     * Specifically, ans is the concatenation of two nums arrays.
     * 
     * Return the array ans.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [1,2,1]
     * Output: [1,2,1,1,2,1]
     * Explanation: The array ans is formed as follows:
     * - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
     * - ans = [1,2,1,1,2,1]
     * Example 2:
     * 
     * Input: nums = [1,3,2,1]
     * Output: [1,3,2,1,1,3,2,1]
     * Explanation: The array ans is formed as follows:
     * - ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
     * - ans = [1,3,2,1,1,3,2,1]
     * 
     * 
     * Constraints:
     * 
     * n == nums.length
     * 1 <= n <= 1000
     * 1 <= nums[i] <= 1000
     * 
     */

    public class Solution {
        public int[] getConcatenation(int[] nums) {

            /* Create New Array with twice the length of the nums array */
            int[] ans = new int[nums.length * 2];

            /**
             * Copied the nums array twice,
             * once starting from the start of the new array
             * the second one starting in the middle of the new array
             * Also used garbage collector to clean memory but got told not be smarter than
             * jvm and remove the method :^(
             */
            System.arraycopy(nums, 0, ans, 0, nums.length);
            System.arraycopy(nums, 0, ans, ans.length / 2, nums.length);

            Arrays.toString(ans);

            return ans;

            /**
             * To test the class instantiate it in the main method like this with dummy test data:
                int[] nums = { 1, 2, 1 };
             // Another test case: [1,3,2,1]
             
                Solution solution = new Solution();
                System.out.println(Arrays.toString(solution.getConcatenation(nums)));
             */

        }
    }
}

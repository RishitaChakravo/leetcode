class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int newlen = 2 * nums.length;
        int[] ans = new int[newlen];
        for(int i = 0; i < length; i++) {
            ans[i] = nums[i];
            ans[i + length] = nums[i];
        }
        return ans;
    }
}
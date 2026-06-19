class Solution {
    public int[] shuffle(int[] nums, int n) {
        int cnt1 = 0, cnt2 = 0, ar1 = 0, ar2 = n;
        int [] ans = new int[nums.length];
        int i = 0;
        while(cnt1 < n && cnt2 <n) {
            if(cnt1 == cnt2) {
                ans[i++] = nums[ar1++];
                cnt1++;
            } else {
                ans[i++] = nums[ar2++];
                cnt2++;
            }
        }
        while(cnt2 < n) {
            ans[i++] = nums[ar2++];
            cnt2++;
        }
        return ans;
    }
}
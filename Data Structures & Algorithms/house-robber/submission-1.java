class Solution {
    public int rob(int[] nums) {
        if(nums.length <= 2){
            int max = 0;
            for(int i = 0; i < nums.length; i++){
                max = Math.max(nums[i], max);
            }
            return max;
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = nums[1];
        for(int i = 2; i < nums.length; i++){
            dp[i] = nums[i] + dp[i - 2];
            dp[i-1] = Math.max(dp[i-2], dp[i-1]);
        }

        return Math.max(dp[nums.length - 1], dp[nums.length - 2]);
    }
}

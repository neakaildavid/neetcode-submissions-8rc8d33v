class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int curStreak = 1;
        int max = 1;
        if(nums.length == 0){
            return 0;
        }
        int prev = nums[0];
        for(int val : nums){
            if(val == prev + 1){
                curStreak++;
                if(curStreak >= max){
                    max = curStreak;
                }
            } else if (val != prev){
                curStreak = 1;
            }

            prev = val;
        }

        return max;
    }
}

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        int max = 0;

        for(int val : nums){
            numSet.add(val);
        }

        for(int i = 0; i < nums.length; i++){
            int cur = nums[i];
            int curStreak = 1;
            if(!numSet.contains(cur - 1)){
                while(numSet.contains(cur + 1)){
                    cur++;
                    curStreak++;
                }
            }

            max = Math.max(curStreak, max);
        }

        return max;
    }

    
}

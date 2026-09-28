class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> numSet = new HashSet<>();
        for(int val : nums){
            numSet.add(val);
        }
        int max = 0;
        for(int val : nums){
            if(!numSet.contains(val - 1)){
                int cur = 1;
                while(numSet.contains(val + cur)){
                    cur++;
                }
                max = Math.max(max, cur);
            }
        }

        return max;
        /*Arrays.sort(nums);
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

        return max;*/
    }
}

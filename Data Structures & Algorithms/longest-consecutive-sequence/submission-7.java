class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        int max = 0;

        for(int val : nums){
            numSet.add(val);
        }

        for(int val : numSet){
            if(!numSet.contains(val - 1)){
                int curStreak = 1;
                while(numSet.contains(val + curStreak)){
                    curStreak++;
                }
                max = Math.max(curStreak, max);
            }

            
        }

        return max;
    }

    
}

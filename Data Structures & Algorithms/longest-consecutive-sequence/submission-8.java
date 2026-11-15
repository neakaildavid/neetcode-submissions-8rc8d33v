class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 0;
        HashMap<Integer, Integer> streaks = new HashMap<>();
        Arrays.sort(nums);
        for(int n : nums){
            int cur = 0;
            if(streaks.containsKey(n -1)){
                cur = streaks.get(n - 1) + 1;
                streaks.put(n, cur);
            } else {
                cur = 1;
            }
            streaks.put(n, cur);
            max = Math.max(max, cur);
        }

        return max;
    }

    
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        Set<Integer> arr = new HashSet<>();
        for (int num : nums) {
            arr.add(num);
        }
        int[] output = new int[k];
        for(int j = 0; j < k; j++){
            int maxNum = nums[0];
            int maxStreak = 0;
            int curStreak = 0;
            int curNum = nums[0];
            for(int i = 0; i < nums.length; i++){
                if(arr.contains(nums[i])){
                    if(nums[i] == curNum){
                        curStreak++;
                        maxStreak = Math.max(maxStreak, curStreak);
                        if(maxStreak == curStreak){
                            maxNum = nums[i];
                        }
                    } else {
                        curNum = nums[i];
                        curStreak = 1;
                        maxStreak = Math.max(maxStreak, curStreak);
                        if(maxStreak == curStreak){
                            maxNum = nums[i];
                        }
                    }
                }
            }
            output[j] = maxNum;
            arr.remove(maxNum);
        }
        return output;
    }
}

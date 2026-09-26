class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++){
            int find = target - nums[i];
            
            if(seen.containsKey(find)){
                int[] output = new int[]{seen.get(find), i};
                return output; 
            }

            seen.put(nums[i], i);
        }

        return null;
    }
}

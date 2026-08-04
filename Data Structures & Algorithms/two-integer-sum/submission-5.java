class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            int cur = nums[i];
            int check = target - cur;
            if(seen.containsKey(check)){
                return new int[] { seen.get(check), i };
            }
            seen.put(cur, i);
        }
        return new int[]{};
    }
}

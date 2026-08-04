class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<Integer, Integer>();
        int[] output = new int[2];
        for(int i = 0; i < nums.length; i++){
            int cur = nums[i];
            int check = target - cur;
            if(seen.containsKey(check)){
                int ind = seen.get(check);
                output[0] = ind;
                output[1] = i;
                return output;
            }
            seen.put(cur, i);
        }
        return output;
    }
}

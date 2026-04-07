class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsStuff = new HashMap<Integer, Integer>();
        for(int i =0; i < nums.length; i++){
            int dif = target - nums[i];
            if(numsStuff.containsKey(dif)){
                int[] indices = new int[2];
                indices[0] = numsStuff.get(dif);
                indices[1] = i;
                return indices;
            }
            numsStuff.put(nums[i], i);
        }
        return null;
    }
}

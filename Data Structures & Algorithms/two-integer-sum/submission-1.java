class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsStuff = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            numsStuff.put(nums[i], i);
        }
        int indices[] = new int[2];
        for(int i = 0; i < nums.length; i++){
            int dif = target - nums[i];
            int indexOne;
            int indexTwo;
            if(numsStuff.containsKey(dif)){
                indexOne = Math.min(numsStuff.get(dif), i);
                indexTwo = Math.max(numsStuff.get(dif), i);
                if(indexOne != indexTwo){
                    indices[0] = indexOne;
                    indices[1] = indexTwo;
                    return indices;
                }
            }
        }
        return indices;
    }
}

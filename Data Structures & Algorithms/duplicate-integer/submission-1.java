class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numsContained = new HashSet<Integer>();
        for (int i =0; i < nums.length; i++){
            if(numsContained.contains(nums[i])){
                return true;
            }
            numsContained.add(nums[i]);
        }
        return false;
    }
}
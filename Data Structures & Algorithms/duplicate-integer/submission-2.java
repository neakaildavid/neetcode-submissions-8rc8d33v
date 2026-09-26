class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            int cur = nums[i];
            if(seen.contains(cur)){
                return true;
            }

            seen.add(cur);
        }

        return false;
    }
}
class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> hashed = new HashMap();
        for(int i = 0; i < nums.length; i++){
            hashed.put(nums[i], nums[i]);
        }
        int length = 0;
        for(int i = 0; i < nums.length; i++){
            if(!(hashed.containsKey(nums[i]-1))){
                int key = nums[i];
                int curLen = 0;
                while (hashed.containsKey(key)){
                    curLen++;
                    key++;
                }
                if(curLen > length){
                    length = curLen;
                }
            }
        }
        return length;
    }
}

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];
        int curMax = Integer.MIN_VALUE;
        for(int i = 0; i < k; i++){
            if(nums[i] > curMax){
                curMax = nums[i];
            }
        }
        int ind = 0;
        int l = 0;
        for(int r = k; r < nums.length; r++){
            res[ind] = curMax;
            int cur = nums[r];
            int leave = nums[l];
            if(cur >= curMax){
                curMax = cur;
            } else if(leave == curMax){
                curMax = Integer.MIN_VALUE;
                for(int i = l + 1; i <= r; i++){
                    if(nums[i] > curMax){
                        curMax = nums[i];
                    }
                }
            }
            l++;
            ind++;
        }
        res[ind] = curMax;
        

        return res;
    }
}
    


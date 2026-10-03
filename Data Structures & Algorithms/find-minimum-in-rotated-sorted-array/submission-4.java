class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int curMin = nums[l];
        while(l <= r){
            int mid = l + (r-l)/2;
            if(nums[mid] < curMin){
                curMin = nums[mid];
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return curMin;
    }
}

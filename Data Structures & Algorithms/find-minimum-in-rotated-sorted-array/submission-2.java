class Solution {
    public int findMin(int[] nums) {
        int length = nums.length;
        int l = 0;
        int r = length - 1;
        int mid = r/2;
        while(l < r){
            if(nums[l] < nums[r]){
                return nums[l];
            }
            if (nums[l] < nums[mid]){
                l = mid;
                mid = (r + l)/2;
            } else if(nums[mid] < nums[r]){
                r = mid;
                mid = (r + l)/2;
            } else if (mid == l){
                l = r;
            }
        }
        return nums[r];
    }
}

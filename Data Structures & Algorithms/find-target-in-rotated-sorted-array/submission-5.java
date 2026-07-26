class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int res = nums[0];
        int min = 0;
        while (l <= r) {
            if (nums[l] < nums[r]) {
                res = Math.min(res, nums[l]);
                if(res == nums[l]){
                    min = l;
                }
                break;
            }

            int m = l + (r - l) / 2;
            res = Math.min(res, nums[m]);
            if(res == nums[m]){
                min = m;
            }
            if (nums[m] >= nums[l]) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        if(min == 0){
            l = 0;
            r = nums.length - 1;
        } else if(target < nums[0]){
            l = min;
            r = nums.length - 1;
        } else {
            l = 0;
            r = min - 1;
        }
        int mid = (l+r)/2;
        int idx = -1;
        while(l <= r){
            if(nums[mid] == target){
                idx = mid;
                break;
            }

            if(target > nums[mid]){
                l = mid + 1;
                mid = (r + l)/2;
            } else{
                r = mid - 1;
                mid = (r+l)/2;
            }
        }
        return idx;
    }
}

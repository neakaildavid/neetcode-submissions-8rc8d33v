class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n - k + 1];
        Deque<Integer> q = new LinkedList<>();
        int l = 0;
        int r = 0;

        while(r < n){
            while(!q.isEmpty() && nums[q.getLast()] < nums[r]){
                q.removeLast();
            }
            q.addLast(r);

            if(l > q.getFirst()){
                q.removeFirst();
            }

            if((r+1) >= k){
                res[l] = nums[q.getFirst()];
                l++;
            }
            r++;
        }

        return res;
        /*int[] res = new int[nums.length - k + 1];
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

        */
    }
}
    


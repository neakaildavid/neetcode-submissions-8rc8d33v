class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 1;
        for(int val : piles){
            if(val > r){
                r = val;
            }
        }
        

        int curMin = r; 
        while(l <= r){
            int mid = l + (r - l)/2;

            int hours = 0;
            for(int pile : piles){
                hours += Math.ceil((double) pile/mid);
            }

            if(hours <= h){
                curMin = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return curMin;

    }
}

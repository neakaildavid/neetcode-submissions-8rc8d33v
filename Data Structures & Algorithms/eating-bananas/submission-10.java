class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int i = 0; i < piles.length; i++){
            max = Math.max(max, piles[i]);
        }

        int min = max;
        int l = 1;
        int r = max;
        while(l <= r){
            int mid = (l + r)/2;
            long hours = 0;
            for(int i = 0; i < piles.length; i++){
                hours += Math.ceilDiv(piles[i], mid);
            }

            if(hours <= h){
                min = Math.min(min, mid);
                r = mid - 1;
            } else {
                l = mid +1;
            }
        }

        return min;
    }
}

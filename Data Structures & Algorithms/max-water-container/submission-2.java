class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int l = 0;
        int r = heights.length - 1;

        while(l < r){
            int min = Math.min(heights[l], heights[r]);
            int curArea = (r - l) * min;

            max = Math.max(curArea, max);
            if(min == heights[l]){
                l++;
            } else {
                r--;
            }
        }

        return max;
    }
}

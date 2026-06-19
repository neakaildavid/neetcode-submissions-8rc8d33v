class Solution {
    public int maxArea(int[] heights) {
        int maxVol = 0;
        int i = 0;
        int j = heights.length - 1;
        while ( i < j){
            int width = j - i;
            int height = Math.min(heights[i], heights[j]);
            int curVol = width * height;
            if(curVol > maxVol){
                maxVol = curVol;
            }
            if(height == heights[i]){
                i++;
            } else {
                j--;
            }
        }
        return maxVol;
    }
}

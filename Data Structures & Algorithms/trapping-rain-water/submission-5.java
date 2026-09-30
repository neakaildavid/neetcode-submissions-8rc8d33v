class Solution {
    public int trap(int[] height) {
       int l = 0;
       int r = height.length - 1;
       int trapped = 0;
       int maxLeft = height[0];
       int maxRight = height[height.length - 1];

       while(l < r){
        if(height[l] <= height[r]){
            l++;
            trapped += Math.max(maxLeft - height[l], 0);
            maxLeft = Math.max(maxLeft, height[l]);
        } else {
            r--;
            trapped += Math.max(maxRight - height[r], 0);
            maxRight = Math.max(maxRight, height[r]);
        }
       }

       return trapped;
       
    }
}

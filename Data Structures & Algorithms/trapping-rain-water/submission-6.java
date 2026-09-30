class Solution {
    public int trap(int[] height) {
       int l = 0;
       int r = height.length - 1;
       int trapped = 0;
       int maxLeft = height[l];
       int maxRight = height[r];

       while(l < r){
        if(height[l] <= height[r]){
            l++;
            maxLeft = Math.max(maxLeft, height[l]);
            trapped += maxLeft - height[l];
        } else {
            r--;
            maxRight = Math.max(maxRight, height[r]);
            trapped += maxRight - height[r];
        }
       }

       return trapped;
       
    }
}

class Solution {
    public int trap(int[] height) {
       int trapped = 0;
       int left = 0;
       int right = height.length - 1;
       while(left < right){
        if(height[left] <= height[right]){
            int r = left + 1;
            int passed = 0;
            while(height[r] < height[left]){
                passed += height[r];
                r++;
                if(r == height.length){
                    return trapped;
                }
            }

            int curTrap = (r - left - 1) * height[left];
            curTrap -= passed;
            trapped += curTrap;
            left = r;
        } else {
            int l = right - 1;
            int passed = 0;
            while(height[l] < height[right]){
                passed += height[l];
                l--;
                if(l == -1){
                    return trapped;
                }
            }

            int curTrap = (right - l - 1) * height[right];
            curTrap -= passed;
            trapped += curTrap;
            right = l;
        }
       }
       return trapped;
    }
}

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        int[] suf = new int[nums.length];

        int preProd = 1;
        int sufProd = 1;

        for(int i = 0; i < nums.length; i++){
            pre[i] = preProd;
            preProd *= nums[i];
        }

        for(int i = nums.length -1; i >= 0; i--){
            suf[i] = sufProd;
            sufProd *= nums[i];
        }

        int[] output = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            output[i] = pre[i] * suf[i];
        }

        return output;
    }
}  

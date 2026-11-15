class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        int[] post = new int[nums.length];

        int prod = 1;
        for(int i = 0; i < nums.length; i++){
            pre[i] = prod;
            prod *= nums[i];
        }

        prod = 1;
        for(int i = nums.length - 1; i >= 0; i--){
            post[i] = prod;
            prod *= nums[i];
        }

        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            res[i] = post[i] * pre[i];
        }

        return res;
    }
}  

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroCount = 0;
        int product = 1;
        int productNoZero = 1;
        for(int val : nums){
            if(val == 0){
                zeroCount++;
            } else {
                productNoZero *= val;
            }

            product *= val;
        }

        int[] output = new int[nums.length];
        if(zeroCount >= 2){
            return output;
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                output[i] = productNoZero;
            } else {
                output[i] = product/nums[i];
            }
        }

        return output;
    }
}  

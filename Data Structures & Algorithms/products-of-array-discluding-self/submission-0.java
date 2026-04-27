class Solution {
    public int[] productExceptSelf(int[] nums) {
        int wholeProduct = nums[0];
        int zero = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == 0){
                zero++;
                continue;
            }else{
                wholeProduct = wholeProduct * nums[i];
            }
        }

        int[] output = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(zero > 0){
                if(nums[i] == 0 && zero == 1){
                    output[i] = wholeProduct;
                } else{
                    output[i] = 0;
                }
            } else {
                output[i] = wholeProduct/nums[i];
            }
        }
        return output;
    }
}  

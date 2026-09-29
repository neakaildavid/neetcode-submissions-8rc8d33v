class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while(left < right){
            int leftNum = numbers[left];
            int rightNum = numbers[right];
            int added = leftNum + rightNum;
            if(added == target){
                return new int[]{left + 1, right + 1};
            }

            if(added > target){
                right--;
            }

            if(added < target){
                left++;
            }
        }

        return new int[]{};
    }
}

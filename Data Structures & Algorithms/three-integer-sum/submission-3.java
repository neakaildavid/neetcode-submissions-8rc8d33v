class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int curNum = 0 - (nums[i]);
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k){
                int curCheck = nums[j] + nums[k];
                if(curNum == curCheck){
                    ArrayList<Integer> added = new ArrayList<>();
                    added.add(nums[i]);
                    added.add(nums[j]);
                    added.add(nums[k]);
                    output.add(added);
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                } else if (curNum < curCheck){
                    k--;
                } else {
                    j++;
                }
            }

        }
        return output;
    }
}

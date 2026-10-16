class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0, new ArrayList<>(), res, target, nums, 0);
        return res;
    }

    public void backtrack(int curSum, List<Integer> path, List<List<Integer>> res, int target, int[] nums, int start){
        if(curSum == target){
            res.add(new ArrayList<>(path));
            return;
        }

        for(int i = start; i < nums.length; i++){
            if(curSum + nums[i] > target){
                continue;
            }
            path.add(nums[i]);
            backtrack(curSum + nums[i], path, res, target, nums, i);
            path.remove(path.size() - 1);
        }
    }
}

class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(0, new ArrayList<>(), target, candidates, 0);
        return res;
    }

    public void backtrack(int curSum, List<Integer> path, int target, int[] nums, int start){
        if(curSum == target){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = start; i < nums.length; i++){
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            if(curSum + nums[i] > target){
                break;
            }
            path.add(nums[i]);
            backtrack(curSum + nums[i], path, target, nums, i + 1);
            path.remove(path.size() - 1);
        }
    }
}

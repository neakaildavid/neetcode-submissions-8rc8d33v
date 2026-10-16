class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0, new ArrayList<>(), nums, res);
        return res;
    }

    public void backtrack(int start, List<Integer> path, int[] nums, List<List<Integer>> res){
        if(start == nums.length){
            res.add(new ArrayList<>(path));
            return;
        }
        backtrack(start + 1, path, nums, res);
        path.add(nums[start]);
        backtrack(start + 1, path, nums, res);
        path.remove(path.size() - 1);  
    }
}

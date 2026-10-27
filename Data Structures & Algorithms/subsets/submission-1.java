class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> subsets(int[] nums) {
        res = new ArrayList<>();
        backtrack(0, new ArrayList<>(), nums);
        return res;
    }

    public void backtrack(int start, List<Integer> path, int[] nums){
        if(start == nums.length){
            res.add(new ArrayList<>(path));
            return;
        }

        path.add(nums[start]);
        backtrack(start + 1, path, nums);
        path.remove(path.size() - 1);
        backtrack(start + 1, path, nums);
    }
}

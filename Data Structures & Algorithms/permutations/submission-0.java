class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(new ArrayList<>(), used, nums);
        return res;
    }

    public void backtrack(List<Integer> path, boolean[] used, int[] nums){
        if(path.size() == nums.length){
            res.add(new ArrayList<>(path));
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(used[i]){
                continue;
            }

            path.add(nums[i]);
            used[i] = true;
            backtrack(path, used, nums);
            path.remove(path.size() - 1);
            used[i] = false;
        }
    }
}

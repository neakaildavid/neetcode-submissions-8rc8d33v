class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        res = new ArrayList<>();
        backtrack(new ArrayList<>(), 0, nums);
        return res;
    }

    public void backtrack(List<Integer> path, int start, int[] nums){
        res.add(new ArrayList<>(path));

        for(int i = start; i < nums.length; i++){
            if(i > start && nums[i] == nums[i - 1]){
                continue;
            }
            path.add(nums[i]);
            backtrack(path, i + 1, nums);
            path.remove(path.size() - 1);
        }
    }
}

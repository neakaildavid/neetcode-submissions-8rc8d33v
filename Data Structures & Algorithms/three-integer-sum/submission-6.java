class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        HashSet<ArrayList<Integer>> seen = new HashSet<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++){
            int j = i + 1;
            int k = nums.length - 1;
            int target = 0 - nums[i];
            while(j < k){
                int sum = nums[j] + nums[k];
                if(sum > target){
                    k--;
                } else if (sum < target){
                    j++;
                } else {
                    ArrayList<Integer> addNew = new ArrayList<>();
                    addNew.add(nums[i]);
                    addNew.add(nums[j]);
                    addNew.add(nums[k]);
                    if(!seen.contains(addNew)){
                        res.add(addNew);
                        seen.add(addNew);
                    }
                    j++;
                    k--;
                }
            }

        }

        return res;
        
    }
}

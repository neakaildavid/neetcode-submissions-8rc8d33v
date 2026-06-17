class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        HashMap<ArrayList<Integer>, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            for(int j = nums.length - 1; j > i; j--){
                for(int k = i+1; k < j; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        ArrayList<Integer> added = new ArrayList();
                        added.add(nums[i]);
                        added.add(nums[j]);
                        added.add(nums[k]);
                        Collections.sort(added);
                        map.put(added, 1);
                    }
                }
            }
        }
        for(ArrayList<Integer> key: map.keySet()){
            output.add(key);
        }
        return output;
    }
}

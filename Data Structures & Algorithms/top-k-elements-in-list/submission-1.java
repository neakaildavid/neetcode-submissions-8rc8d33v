class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencies = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(frequencies.containsKey(nums[i])){
                int val = frequencies.get(nums[i]);
                val++;
                frequencies.put(nums[i], val);
            }else{
                frequencies.put(nums[i], 1);
            }
        }
        int[] numbers = new int[k];
        for(int i = 0; i < k; i++){
            int max = 1;
            int maxKey = nums[0];
            for(int key: frequencies.keySet()){
                max = Math.max(frequencies.get(key), max);
                if(max == frequencies.get(key)){
                    maxKey = key;
                }
            }
            frequencies.remove(maxKey);
            numbers[i] = maxKey;
        }
        return numbers;
    }
}

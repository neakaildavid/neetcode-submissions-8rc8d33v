class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        ArrayList<Integer>[] freq = new ArrayList[nums.length + 1];
        HashMap<Integer, Integer> count = new HashMap<>();

        for(int i = 0; i < freq.length; i++){
            freq[i] = new ArrayList<>();
        }

        for(int num : nums){
            if(count.containsKey(num)){
                count.put(num, count.get(num) + 1);
            } else {
                count.put(num, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] output = new int[k];
        int j = 0;
        for(int i = freq.length - 1; i > 0 && j < k; i-- ){
            for(int n: freq[i]){
                output[j] = n;
                j++;

                if(j == k){
                    return output;
                }
            }
        }

        return output;

    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqs = new HashMap<>();
        List<Integer>[] f = new List[nums.length + 1];
        int[] res = new int[k];
        for(int n : nums){
            if(freqs.containsKey(n)){
                freqs.put(n, freqs.get(n) + 1);
            } else {
                freqs.put(n, 1);
            }
        }

        for(int i = 0; i < f.length; i++){
            f[i] = new ArrayList<>();
        }
        for (Map.Entry<Integer, Integer> entry : freqs.entrySet()) {
            f[entry.getValue()].add(entry.getKey());
        }

        int index = 0;
        for (int i = f.length - 1; i > 0 && index < k; i--) {
            for (int n : f[i]) {
                res[index++] = n;
                if (index == k) {
                    return res;
                }
            }
        }

        return res;
    }
}

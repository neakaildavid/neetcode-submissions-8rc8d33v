class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> groups = new HashMap<>();

        for(String s : strs){
            int[] freq = new int[26];
            for(char c : s.toCharArray()){
                freq[c - 'a']++;
            }

            String grouped = Arrays.toString(freq);

            if(groups.containsKey(grouped)){
                groups.get(grouped).add(s);
            } else {
                groups.put(grouped, new ArrayList<>());
                groups.get(grouped).add(s);
            }
        }

        return new ArrayList<>(groups.values());
    }
}

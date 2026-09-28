class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> anagrams = new HashMap<String, ArrayList<String>>();

        for (String s : strs){
            int[] count = new int[26];
            for(char c : s.toCharArray()){
                count[c - 'a']++;
            }

            String key = Arrays.toString(count);
            anagrams.putIfAbsent(key, new ArrayList<>());
            anagrams.get(key).add(s);
        }
        return new ArrayList<>(anagrams.values());

    }
}

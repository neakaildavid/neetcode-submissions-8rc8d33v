class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagrams = new HashMap<>();

        for(String s : strs){
            char[] counts = new char[26];
            for(char c : s.toCharArray()){
                counts[c - 'a']++;
            }

            String sorted = Arrays.toString(counts);
            anagrams.putIfAbsent(sorted, new ArrayList<>());
            anagrams.get(sorted).add(s);
        }

        return new ArrayList<>(anagrams.values());
    }
}

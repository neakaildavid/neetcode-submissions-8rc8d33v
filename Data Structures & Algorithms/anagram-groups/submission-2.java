class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> output = new ArrayList<>();
        HashMap<String, ArrayList<String>> anagrams = new HashMap<String, ArrayList<String>>();

        for(int i = 0; i < strs.length; i++){
            String cur = strs[i];
            char[] curStr = cur.toCharArray();
            Arrays.sort(curStr);
            String newStr = new String(curStr);

            if(anagrams.containsKey(newStr)){
                anagrams.get(newStr).add(cur);
            } else{
                anagrams.put(newStr, new ArrayList<String>());
                anagrams.get(newStr).add(cur);
            }
        }

        output.addAll(anagrams.values());
        return output;

    }
}

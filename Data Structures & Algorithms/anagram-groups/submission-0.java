class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagrams = new ArrayList<>();
        Map<Map<Character, Integer>, Integer> strings = new HashMap<Map<Character, Integer>, Integer>();
        for(int i = 0; i < strs.length; i++){
            String str = strs[i];
            Map<Character, Integer> chars = new HashMap<Character, Integer>();
            for(int j = 0; j < str.length(); j++){
                Character c = str.charAt(j);
                if(chars.containsKey(c)){
                    int val = chars.get(c) + 1;
                    chars.put(c, val);
                }else{
                    chars.put(c, 1);
                }
            }
            if(strings.containsKey(chars)){
                anagrams.get(strings.get(chars)).add(str);
            } else {
                List<String> newString = new ArrayList<String>();
                newString.add(str);
                anagrams.add(newString);
                strings.put(chars, anagrams.size() -1 );
            }
        }

        return anagrams;
    }
}

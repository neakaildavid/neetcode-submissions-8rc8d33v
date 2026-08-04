class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sChars = new HashMap<Character, Integer>();
        Map<Character, Integer> tChars = new HashMap<Character, Integer>();

        for(int i = 0; i < s.length(); i++){
            Character sChar = s.charAt(i);
            if(sChars.containsKey(sChar)){
                int val = sChars.get(sChar);
                sChars.put(sChar, ++val);
            } else {
                sChars.put(sChar, 1);
            }
        }

        for(int i = 0; i < t.length(); i++){
            Character tChar = t.charAt(i);
            if(tChars.containsKey(tChar)){
                int val = tChars.get(tChar);
                tChars.put(tChar, ++val);
            } else {
                tChars.put(tChar, 1);
            }
        }

        if(tChars.equals(sChars)){
            return true;
        } else {
            return false;
        }

    }
}

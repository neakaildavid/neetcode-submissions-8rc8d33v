class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> curChars = new HashMap<Character, Integer>();
        int longest = 0;
        int cur = 0;
        int reset = 0;
        for(int i = 0; i < s.length(); i++){
            if(!curChars.containsKey(s.charAt(i))){
                curChars.put(s.charAt(i), i + 1);
            } else {
                int curReset = curChars.get(s.charAt(i));
                if(curReset > reset){
                    reset = curReset;
                }
                curChars.put(s.charAt(i), i + 1);
            }
            cur = i - reset + 1;
            if(cur > longest){
                longest = cur;
            }
        }
        return longest;
    }
}

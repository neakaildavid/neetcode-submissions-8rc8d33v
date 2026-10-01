class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> letters = new HashMap<>();
        int l = 0;
        int r = 1;
        int max = 1;
        if(s.length() == 0){
            return 0;
        } else if (s.length() == 1){
            return 1;
        }
        char[] sArr = s.toCharArray();
        letters.put(sArr[l], l);

        while(r < sArr.length){
            char cur = sArr[r];
            if(letters.containsKey(cur)){
                l = letters.get(cur) + 1;
                r = l + 1;
                letters.clear();
                letters.put(sArr[l], l);

            } else {
                letters.put(cur, r);
                max = Math.max(max, r - l + 1);
                r++;
            }
        }

        return max;
    }
}

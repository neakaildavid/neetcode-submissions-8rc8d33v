class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> seen = new HashSet<>();
        int l = 0;
        int r = 1;
        int max = 1;
        char[] sArr = s.toCharArray();
        if(sArr.length == 0){
            return 0;
        }
        seen.add(sArr[l]);
        while(r < sArr.length){
            char cur = sArr[r];
            while(seen.contains(cur)){
                seen.remove(sArr[l]);
                l++;
            }
            seen.add(cur);

            max = Math.max(max, r - l + 1);
            r++;
        }

        return max;
    }
}

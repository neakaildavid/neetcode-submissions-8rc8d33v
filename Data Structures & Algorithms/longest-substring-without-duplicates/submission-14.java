class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> seen = new HashSet<>();

        int l = 0;
        int r = 0;
        int max = 0;
        while(r < s.length()){
            char rChar = s.charAt(r);
            if(seen.contains(rChar)){
                while(l < s.length() && s.charAt(l) != rChar){
                    seen.remove(s.charAt(l));
                    l++;
                }
                l++;
            }

            seen.add(rChar);
            max = Math.max(max, r - l + 1);
            r++;
        }

        return max;
    }
}

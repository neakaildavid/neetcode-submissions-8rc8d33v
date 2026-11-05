class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> counts = new HashMap<>();
        int l = 0;
        int r = 0;
        int high = 0;
        int maxWindow = 0;
        while(r < s.length()){
            char cur = s.charAt(r);
            int count;
            if(counts.containsKey(cur)){
                count = counts.get(cur) + 1;
            } else {
                count = 1;
            }
            counts.put(cur, count);

            high = Math.max(high, count);
            if((r - l + 1) - high > k){
                char leftChar = s.charAt(l);
                counts.put(leftChar, counts.get(leftChar) - 1);
                l++;
            }

            maxWindow = Math.max(maxWindow, r - l + 1);
            r++;
        }

        return maxWindow;

    }
}

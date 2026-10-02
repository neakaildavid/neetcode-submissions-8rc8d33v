class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1Count = new int[26];

        for(char c : s1.toCharArray()){
            s1Count[c - 'a']++;
        }
        
        int[] s2Count = new int[26];
        int l = 0;
        int r = 0;
        while(r < s2.length()){
            char cur = s2.charAt(r);
            if(s1Count[cur - 'a'] > s2Count[cur - 'a']){
                System.out.println(cur);
                s2Count[cur - 'a']++;
                r++;                
            } else {
                while(s2Count[cur - 'a'] >= s1Count[cur - 'a']){
                    s2Count[s2.charAt(l) - 'a']--;
                    l++;
                }
            }

            if(Arrays.equals(s1Count, s2Count)){
                return true;
            }
        }

        return false;
    }
}

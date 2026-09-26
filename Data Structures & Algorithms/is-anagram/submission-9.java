class Solution {
    public boolean isAnagram(String s, String t) {
        int[] scount = new int[26];
        int[] tcount = new int[26];

        for(char c : s.toCharArray()){
            scount[c - 'a']++;
        }

        for(char c : t.toCharArray()){
            tcount[c - 'a']++;
        }

        String sAn = Arrays.toString(scount);
        String tAn = Arrays.toString(tcount);

        
        if(sAn.equals(tAn)){
            return true;
        } else {
            return false;
        }
    }
}

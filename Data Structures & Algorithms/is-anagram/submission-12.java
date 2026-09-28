class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        int[] count = new int[26];
        for(int i = 0; i < sArr.length; i++){
            count[sArr[i] - 'a']++;
            count[tArr[i] - 'a']--;
        }

        for(int val : count){
            if(val != 0){
                return false;
            }
        }
        return true;
    }
}

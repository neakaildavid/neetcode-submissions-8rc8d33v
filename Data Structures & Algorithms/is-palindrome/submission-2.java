class Solution {
    public boolean isPalindrome(String s) {
        String fixed = "";

        for(int i = 0; i < s.length(); i++){
            int curChar = s.charAt(i);
            if(curChar >= 65 && curChar <= 90){
                curChar = (curChar + 32);
                System.out.println(fixed);
            }

            if(curChar >= 48 && curChar <= 57){
                fixed += (char)curChar;
                continue;
            } else if (curChar >= 97 && curChar <= 122){
                fixed += (char)curChar;                
            }
        }
        int i = 0;
        int j = fixed.length() - 1;
        while(i <= j){
            int charOne = fixed.charAt(i);
            int charTwo = fixed.charAt(j);
            if(charOne != charTwo){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

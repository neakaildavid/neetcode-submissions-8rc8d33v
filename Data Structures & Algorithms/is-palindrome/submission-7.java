class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] chars = s.toCharArray();
        while(left <= right){
            char leftChar = chars[left];
            char rightChar = chars[right];
            if(!(Character.isLetterOrDigit(leftChar))){
                left++;
                continue;
            }

            if(!(Character.isLetterOrDigit(rightChar))){
                right--;
                continue;
            }
            if(!(Character.isDigit(leftChar))){
                leftChar = Character.toLowerCase(leftChar);
            }

            if(!(Character.isDigit(rightChar))){
               rightChar = Character.toLowerCase(rightChar);
            }

            if(leftChar != rightChar){
                System.out.println(leftChar);
                System.out.println(rightChar);
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}

class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while(right >= left){
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if(!Character.isLetterOrDigit(leftChar)){
                left++;
                continue;
            }

            if(!Character.isLetterOrDigit(rightChar)){
                right--;
                continue;
            }

            if(Character.isDigit(leftChar) || Character.isDigit(rightChar)){
                if(leftChar != rightChar){
                    return false;
                } else {
                    left++;
                    right--;
                    continue;
                }
            }

            if(Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)){
                return false;
            } else {
                left++;
                right--;
                continue;
            }
        }
        return true;
    }
}

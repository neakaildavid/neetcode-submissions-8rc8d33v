class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i = 0; i < s.length(); i++){
            char curChar = s.charAt(i);
            if(curChar == '}' || curChar == ']' || curChar == ')'){
                if(stack.size() == 0){
                    return false;
                }
                char otherChar = stack.pop();
                if(otherChar != (curChar - 2) && otherChar != (curChar -1)){
                    return false;
                }
            } else{
                stack.push(curChar);
            }
        }
        if(stack.size() != 0){
            return false;
        }
        return true;
    }
}

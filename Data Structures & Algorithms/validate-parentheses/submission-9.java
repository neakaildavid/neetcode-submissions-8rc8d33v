class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            } else {
                if(stack.isEmpty()){
                    return false;
                }
                char check = stack.pop();
                if(c == ')' && check != '('){
                    return false;
                } else if (c == ']' && check != '['){
                    return false;
                } else if (c == '}' && check != '{'){
                    return false;
                }
            }
        }

        if(stack.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
}

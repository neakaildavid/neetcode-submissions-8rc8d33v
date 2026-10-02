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
                char top = stack.peek();
                if((top == '(' && c ==')') ||(top == '[' && c == ']') || (top == '{' && c == '}')){
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }

        if(stack.isEmpty()){
            return true;
        } else{
            return false;
        }
    }
}

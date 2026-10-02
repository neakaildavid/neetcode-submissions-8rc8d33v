class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> nums = new ArrayDeque<>();
        int end = 0;
        for(String s : tokens){
            if(!s.equals("+") && !s.equals("*") && !s.equals("-") && !s.equals("/")){
                nums.push(Integer.parseInt(s));
            } else {
                char c = s.charAt(0);
                int first = nums.pop();
                int second = nums.pop();
                if(c == '+'){
                    int added = first + second;
                    nums.push(added);
                } else if (c == '-'){
                    int sub = second - first;
                    nums.push(sub);
                } else if (c == '*'){
                    int mult = first * second;
                    nums.push(mult);
                } else if (c == '/'){
                    int div = second/first;
                    nums.push(div);
                }
            }
        }

        return nums.pop();
    }
}

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<int[]> stack = new ArrayDeque<>();
        int[] res = new int[temperatures.length];
        for(int i= 0; i < temperatures.length; i++){
            int t = temperatures[i];
            while(!stack.isEmpty() && t > stack.peek()[0]){
                int ind = stack.pop()[1];
                res[ind] = i - ind;
            }

            int[] pair = new int[]{t, i};
            stack.push(pair);
        }
        return res;
    }
}

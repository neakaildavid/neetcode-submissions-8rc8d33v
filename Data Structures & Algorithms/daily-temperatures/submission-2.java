class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] output = new int[temperatures.length];
        Stack<int[]> stack = new Stack<int[]>();
        for(int i = 0; i < temperatures.length; i++){
            int temp = temperatures[i];
            if(!stack.isEmpty()){
                while(!stack.isEmpty() && temp > stack.peek()[0]){
                    int ind = stack.pop()[1];
                    output[ind] = i - ind;
                }
            }
            int[] x = new int[]{temp, i};
            stack.push(x);
        }
        return output;
    }
}

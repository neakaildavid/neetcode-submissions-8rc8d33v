class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] output = new int[temperatures.length];
        Stack<int[]> stack = new Stack<int[]>();
        HashMap<Integer, Integer> indices = new HashMap<Integer, Integer>();
        for(int i = 0; i < temperatures.length; i++){
            int temp = temperatures[i];
            //indices.put(temp, i);

            if(!stack.isEmpty()){
                while(!stack.isEmpty() && temp > stack.peek()[0]){
                    int ind = stack.pop()[1];
                    //indices.get(stack.pop());
                    output[ind] = i - ind;
                }
            }
            int[] x = new int[]{temp, i};
            stack.push(x);
        }
        return output;
    }
}

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] pair = new int[position.length][2];

        for(int i = 0; i < position.length; i++){
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }

        Arrays.sort(pair, (a,b) -> Integer.compare(a[0], b[0]));

        Deque<Double> stack = new ArrayDeque<>();
        
        int pos = pair[0][0];
        int s = pair[0][1];

        double time = (double)(target - pos)/s;
        stack.push(time);
        for(int i = 1; i < position.length; i++){
            pos = pair[i][0];
            s = pair[i][1];

            time = (double)(target - pos)/s;

            while(!stack.isEmpty() && time >= stack.peek()){
                stack.pop();
            }

            stack.push(time);
        }

        return stack.size();
    }
}

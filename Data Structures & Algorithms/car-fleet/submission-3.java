class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        int[][] pair = new int[position.length][2];
        for (int i = 0; i < position.length; i++) {
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }

        Arrays.sort(pair, (a,b) -> Integer.compare(a[0], b[0]));
        Stack<Double> stack = new Stack<>();

        for(int[] p : pair){
            double hours = (double) (target - p[0])/p[1];
            while(!stack.isEmpty() && stack.peek() <= hours){
                stack.pop();
            }
            stack.push(hours);
        }

        return stack.size();
        /*Deque<Double> stack = new ArrayDeque<>();
        HashMap<Integer, Integer> positionMap = new HashMap<>();
        for(int i = 0; i < position.length; i++){
            positionMap.put(position[i], speed[i]);
        }
        Arrays.sort(position);
        for(int i = 0; i < position.length; i++){
            double hours = (double) (target - position[i])/positionMap.get(position[i]);
            while(!stack.isEmpty() && stack.peek() <= hours){
                stack.pop();
            }
            stack.push(hours);
        }

        return stack.size();
        */
    }
}

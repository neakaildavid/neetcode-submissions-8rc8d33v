class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Deque<Double> stack = new ArrayDeque<>();
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
    }
}

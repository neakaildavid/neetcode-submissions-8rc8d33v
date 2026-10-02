class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<ArrayList<Integer>> maxTemps = new ArrayDeque<>();
        int[] res = new int[temperatures.length];
        for(int i= 0; i < temperatures.length; i++){
            if(maxTemps.isEmpty()){
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(temperatures[i]);
                pair.add(i);
                maxTemps.push(pair);
            } else {
                while(!maxTemps.isEmpty()){
                    if(temperatures[i] > maxTemps.peek().get(0)){
                        int ind = maxTemps.pop().get(1);
                        res[ind] = i - ind;
                    } else {
                        break;
                    } 
                }
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(temperatures[i]);
                pair.add(i);
                maxTemps.push(pair);
            }
        }
        return res;
    }
}

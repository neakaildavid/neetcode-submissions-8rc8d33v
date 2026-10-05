class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] frequency = new int[26];
        for(char c : tasks){
            frequency[c -'A']++;
        }

        PriorityQueue<Integer> mostFreq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < frequency.length; i++){
            if(frequency[i] != 0){
                mostFreq.offer(frequency[i]);
            }
        }

        int time = 0;
        Queue<int[]> cooldown = new ArrayDeque<>();
        while(!mostFreq.isEmpty() || !cooldown.isEmpty()){
            time++;

            if(mostFreq.isEmpty()){
                time = cooldown.peek()[1];
            } else {
                int task = mostFreq.poll() - 1;
                if(task > 0){
                    cooldown.offer(new int[]{task, time + n});
                }
            }

            if(!cooldown.isEmpty() && cooldown.peek()[1] == time){
                mostFreq.offer(cooldown.poll()[0]);
            }
        }

        return time;

    }
}

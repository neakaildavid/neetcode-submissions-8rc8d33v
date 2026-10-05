class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < stones.length; i++){
            maxHeap.offer(stones[i]);
        }

        while(maxHeap.size() > 1){
            int stoneOne = maxHeap.poll();
            int stoneTwo = maxHeap.poll();

            if(stoneOne == stoneTwo){
                continue;
            } else {
                maxHeap.add(Math.abs(stoneOne - stoneTwo));
            }
        }

        if(maxHeap.peek() == null){
            return 0;
        } else {
            return maxHeap.peek();
        }
    }
}

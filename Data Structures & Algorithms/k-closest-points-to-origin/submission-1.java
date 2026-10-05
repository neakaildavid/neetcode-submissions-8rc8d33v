class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> distances = new PriorityQueue<>((a,b) -> Integer.compare(b[0] * b[0] + b[1] * b[1], a[0] * a[0] + a[1] * a[1]));

        for(int[] point : points){
            distances.offer(point);
            if(distances.size() > k){
                distances.poll();
            }
        }

        int[][] res = new int[k][2];
        for(int i = 0; i < k; i++){
            res[i] = distances.poll();
        }

        return res;
        
    }
}

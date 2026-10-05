class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Double> distances = new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Double, List<int[]>> seen = new HashMap<>();
        int[][] res = new int[k][2];

        for(int r = 0; r < points.length; r++){
            double curDist = (double) Math.sqrt((points[r][0])*(points[r][0]) + (points[r][1])*(points[r][1]) );
            int[] point = new int[]{points[r][0], points[r][1]};
            if(distances.size() == k){
                double curMax = distances.peek();
                if(curDist < curMax){
                    distances.poll();
                    distances.add(curDist);
                    seen.computeIfAbsent(curDist, x -> new ArrayList<>()).add(point);
                    
                }
            } else {
                distances.add(curDist);
                seen.computeIfAbsent(curDist, x -> new ArrayList<>()).add(point);
            }
        }

        for(int r = 0; r < res.length; r++){
            double dist = distances.poll();
            int[] point = seen.get(dist).get(0);
            seen.get(dist).remove(0);
            res[r][0] = point[0];
            res[r][1] = point[1];
        }

        return res;
    }
}

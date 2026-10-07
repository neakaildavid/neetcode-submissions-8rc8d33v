class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> groups = new ArrayList<int[]>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        groups.add(intervals[0]);
        for(int[] range : intervals){
            int start = range[0];
            int end = range[1];
            int lastEnd = groups.get(groups.size() - 1)[1];

            if(start <= lastEnd){
                groups.get(groups.size() - 1)[1] = Math.max(lastEnd, end);
            } else {
                groups.add(new int[]{start, end});
            }
        }

        return groups.toArray(new int[groups.size()][]);
    }
}

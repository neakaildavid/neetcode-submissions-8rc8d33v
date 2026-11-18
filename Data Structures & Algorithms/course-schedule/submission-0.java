class Solution {
    /*

    [0,1] [] [2,0] 


    */

    private HashMap<Integer, Integer> elements;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        elements = new HashMap<>();
        for(int i = 0; i < prerequisites.length; i++){
            elements.put(prerequisites[i][0], i);
        }
        for(int r = 0; r < prerequisites.length; r++){
            HashSet<Integer> path = new HashSet<>();
            if(!dfs(r, prerequisites, path)){
                return false;
            }
        }

        return true;
    }

    public boolean dfs(int r, int[][] prerequisites, HashSet<Integer> path){
        if(path.contains(prerequisites[r][0])){
            return false;
        }
        if(elements.get(prerequisites[r][1]) == null){
            return true;
        }
        path.add(prerequisites[r][0]);
        return dfs(elements.get(prerequisites[r][1]), prerequisites, path);
    }
}

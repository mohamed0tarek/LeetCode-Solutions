class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(n == 1 && source == destination) return true;
        Queue<int[]> que = new LinkedList<>();
        boolean[] visited = new boolean[edges.length];
        Set<Integer> sources = new HashSet<>();
        sources.add(source);
        List<int[]> temp = findEdges(visited,edges,source);
        if(!temp.isEmpty()){
            for (int[] x : temp)
                que.add(x);
        }
        while (!que.isEmpty()){
            int[] values = que.poll();
            if(values[0] == destination || values[1] == destination)
                return true;
            source = (!sources.contains(values[0]))?values[0]:values[1];
            sources.add(source);
            temp = findEdges(visited,edges,source);
            if(!temp.isEmpty()){
                for (int[] x : temp)
                    que.add(x);
            }
        }
        return false;
    }
    
    public List<int[]> findEdges(boolean[] visited, int[][] edges, int source){
        List<int[]> res = new ArrayList<>();
        for(int i=0;i<edges.length;i++){
            for (int j=0;j<edges[i].length;j++){
                if(edges[i][j] == source && !visited[i]){
                    res.add(edges[i]);
                    visited[i] = true;
                }
            }
        }
        return res;
    }
}

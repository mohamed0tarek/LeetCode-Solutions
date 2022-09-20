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
---------------------------------------------------------------------------
    
    class Solution {
    public boolean validPath(int n, int[][] edges, int start, int end) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for (int i = 0; i < edges.length; i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> vis = new HashSet<>();
        q.add(start);
        while (!q.isEmpty()) {
            int u = q.poll();
            vis.add(u);
            if (u == end) return true;
            for (int v : adj.get(u)) {
                if (!vis.contains(v)) {
                    q.add(v);
                }
            }
        }
        return false;
    }
}

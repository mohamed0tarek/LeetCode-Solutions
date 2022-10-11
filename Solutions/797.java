class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        DFS(result, new ArrayList<>(), graph, 0);
        return result;
    }

    private void DFS(List<List<Integer>> result, List<Integer> path, int[][] graph, int cur) {
        path.add(cur);
        if(cur == graph.length-1){
            result.add(new ArrayList<>(path));
        } else {
            for (int neighbour : graph[cur])
                DFS(result, path, graph, neighbour);
        }
        path.remove(path.size()-1);
    }
}

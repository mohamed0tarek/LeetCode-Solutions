class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        DFS(0, rooms, visited);
        for (boolean x : visited)
            if (!x)
                return x;
        return true;
    }

    private void DFS(int i, List<List<Integer>> rooms, boolean[] visited) {
        visited[i] = true;
        for(int item : rooms.get(i))
            if(!visited[item])
                DFS(item,rooms,visited);
    }
}

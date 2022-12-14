class Solution {
    public int[] processQueries(int[] queries, int m) {
        List<Integer> P = new ArrayList<>(m);
        int[] result = new int[queries.length];
        for(int i=1 ; i<= m ; i++)
            P.add(i);
        for(int i=0;i<queries.length;i++){
            int index = P.indexOf(queries[i]);
            result[i] = index;
            int temp = P.remove(index);
            P.add(0, temp);
        }
        return result;
    }
}

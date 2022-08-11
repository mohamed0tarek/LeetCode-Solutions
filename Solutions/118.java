class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        List<Integer> invoked = new ArrayList<>();
        res.add(List.of(1));
       if(numRows == 1) return res;
        int i = 1, j = 1;
        res.add(List.of(1, 1));
        while (res.size() < numRows) {
            temp.add(1);
            invoked = res.get(i);
            while (j < invoked.size()) {
                temp.add(invoked.get(j) + invoked.get(j - 1));
                j++;
            }
            temp.add(1);
            res.add(List.copyOf(temp));
            temp.clear();
            i++;
            j = 1;
        }
        return res;
    }
}

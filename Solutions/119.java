class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        long ncr = 1;
        while (i <= rowIndex) {
            list.add((int)ncr);
            ncr = ((rowIndex - i) * ncr) / (i + 1);
            i++;
        }
        return list;
    }
}

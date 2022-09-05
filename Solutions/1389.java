class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> res = new ArrayList<>();
        for (int i=0;i<index.length;i++){
            res.add(index[i],nums[i]);
        }
        return res.stream().mapToInt(x->x).toArray();
    }
}

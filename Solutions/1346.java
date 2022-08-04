class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Double> set = new HashSet<>();
        for (int x : arr) {
            if (set.contains((double)x / 2) || set.contains((double)x * 2))
                return true;
            set.add((double)x);
        }
        return false;
    }
}

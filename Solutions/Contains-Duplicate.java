class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hash_set = new HashSet();
        for (int x : nums){
            if(hash_set.contains(x)){
                return true;
            }
            hash_set.add(x);
        }
        return false;
    }
}

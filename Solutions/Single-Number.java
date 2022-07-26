class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> hash_set = new HashSet();
        for(int x : nums){
            if(hash_set.contains(x)){
                hash_set.remove(x);
            } else {
                hash_set.add(x);
            }
        }
        Object[] arr = hash_set.toArray();
        return (int)arr[0];
    }
}

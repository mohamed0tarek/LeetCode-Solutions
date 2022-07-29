class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> builder = new ArrayList<>();
        Map<Integer,Integer> hash = new HashMap<>();
        
        for (int x: nums1){
            hash.put(x,hash.getOrDefault(x,0)+1);
        }
        
        for (int x : nums2){
            if(hash.containsKey(x) && hash.get(x) > 0){
                builder.add(x);
                hash.put(x,hash.get(x)-1);
            }
        }
        
        
        return builder.stream().mapToInt(x -> x).toArray();
    }
}

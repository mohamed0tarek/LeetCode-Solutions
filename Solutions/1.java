class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hash = new HashMap<>();
        int i=0,key=0;
        for (i=0;i<nums.length;i++){
            key = target - nums[i];
            if(hash.containsKey(key)){
                break;
            }
            hash.put(nums[i],i);
        }
        return new int[] {hash.get(key),i};
    }
}

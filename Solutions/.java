class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count =0;
        Map<Character,Integer> hash = new HashMap<>();
        for (int i=0;i<stones.length();i++){
            hash.put(stones.charAt(i), hash.getOrDefault(stones.charAt(i),0)+1);
        }
        for (int i=0;i<jewels.length();i++){
            count += hash.getOrDefault(jewels.charAt(i),0);
        }
        return count;
    }
}

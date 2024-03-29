class Solution {
    private Map<Integer, Integer> cache = new HashMap<>();
    public int climbStairs(int n) {
        if(n <= 2) return n;
        if(cache.containsKey(n))
            return cache.get(n);
        cache.put(n, climbStairs(n-1) + climbStairs(n-2));
        return cache.get(n);
    }
}

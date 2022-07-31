class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int i=0,j=0,res=0;
        if(s==null || s.length()==0) return 0;
        while (i < s.length()){
            char c =s.charAt(i);
            while (set.contains(c)){
                set.remove(s.charAt(j));
                j++;
            }
            set.add(c);
            res = Math.max(res, i-j+1);
            i++;
        }
        return res;
    }
}

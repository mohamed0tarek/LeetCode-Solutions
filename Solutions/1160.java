class Solution {
    public int countCharacters(String[] words, String chars) {
      if (chars == null || chars.isEmpty() || words == null || words.length == 0)
            return 0;
        
        int[] counts = new int[26];
        for (char ch : chars.toCharArray()) {
            ++counts[ch - 'a'];    
        }
        
        int res = 0;
        for (String w : words) {
            int[] wordCounts = new int[26];
            boolean possible = true;
            for (char ch : w.toCharArray()) {
                int idx = ch - 'a';
                ++wordCounts[idx];
                if (wordCounts[idx] > counts[idx]) {
                    possible = false;
                    break;
                }
            }
    
            if (!possible)
                continue;
            
            res+=w.length();
        }
        return res;
    }
}

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] rans = new int[26];
        int[] mag = new int[26];
        boolean flage = true;
        
        rans = nomOfLetters(ransomNote);
        mag = nomOfLetters(magazine);
        
        for (int i=0;i<rans.length;i++){
            if(rans[i] != 0 && rans[i]>mag[i]){
                flage = false;
                break;
            }
        }
        return flage;
    }
    
    public int[] nomOfLetters(String word){
        int[] temp = new int[26];
        for (int i=0;i<word.length();i++){
            temp[word.charAt(i) - 'a']++;
        }
        return temp;
    }
}

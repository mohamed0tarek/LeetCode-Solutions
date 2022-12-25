class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] sorted = new String[arr.length];

        for (String str : arr) {
            int len = str.length();
            int index = str.charAt(len - 1) - '0';
            sorted[index - 1] = str.substring(0, len - 1);
        }
        return String.join(" ", sorted);
    }
}

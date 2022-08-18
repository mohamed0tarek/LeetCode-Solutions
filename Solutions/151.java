First Soluiton
----------------
class Solution {
    public String reverseWords(String s) {
        List<String> e = Arrays.stream(s.trim().split(" "))
                .filter(x -> !x.isEmpty())
                .collect(Collectors.toCollection(ArrayList::new));
        Collections.reverse(e);
        String[] res = e.toArray(new String[0]);
        return String.join(" ", res);
    }
}
*
*
*
------------------
Second Solution
------------------
class Solution {
    public String reverseWords(String s) {
        List<String> e = Arrays.stream(s.trim().split(" "))
                .filter(x -> !x.isEmpty())
                .collect(Collectors.toCollection(ArrayList::new));
        Collections.reverse(e);
        String[] res = e.toArray(new String[0]);
        return String.join(" ", res);
    }
}

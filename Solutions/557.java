class Solution {
    public String reverseWords(String s) {
        StringBuilder temp = new StringBuilder();
        StringBuilder res = Arrays.stream(s.split(" "))
                .filter(x->!x.isEmpty())
                .map(x->{
                    temp.setLength(0);
                    return temp.append(x);
                })
                .collect(
                        StringBuilder::new,
                        (r,e)->r.append(e.reverse()).append(" "),
                        StringBuilder::append
                );
        return res.toString().trim();
    }
}

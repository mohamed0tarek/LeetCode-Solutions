class Solution {
    public int numberOfBeams(String[] bank) {
        int sum =0;
        int[] ones = Arrays.stream(bank).mapToInt(r -> r.replace("0", "").length())
                .filter(r -> r > 0).toArray();
        for(int i=0;i<ones.length-1;i++)
            sum += ones[i]*ones[i+1];
        return sum;
    }
}

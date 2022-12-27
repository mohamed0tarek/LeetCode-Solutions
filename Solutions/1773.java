class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int counter = 0;
        List<String> describe = Arrays.asList("type", "color", "name");
        int index = describe.indexOf(ruleKey);
        for(List<String> list : items)
            counter += list.get(index).equals(ruleValue) ? 1 : 0;
        return counter;
    }
}

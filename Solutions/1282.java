First solution
---------------------
public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < groupSizes.length; i++) {
            if(map.containsKey(groupSizes[i])){
                map.get(groupSizes[i]).add(i);
            } else {
                map.put(groupSizes[i], new ArrayList<>());
                map.get(groupSizes[i]).add(i);
            }
            if(map.get(groupSizes[i]).size() >= groupSizes[i]){
                res.add(new ArrayList<>(map.get(groupSizes[i])));
                map.get(groupSizes[i]).clear();                    
            }
        }
        return res;
    }
============================================================
  Second solution
--------------------
  class Solution {
    public List<List<Integer>> groupThePeople(int[] gz) {
  List<List<Integer>> res = new ArrayList();
  Map<Integer, List<Integer>> groups = new HashMap<>();
  for (int i = 0; i < gz.length; ++i) {
    List<Integer> list = groups.computeIfAbsent(gz[i], k -> new ArrayList());
    list.add(i);
    if (list.size() == gz[i]) {
      res.add(list);
      groups.put(gz[i], new ArrayList());
    }
  }
  return res;
}
}

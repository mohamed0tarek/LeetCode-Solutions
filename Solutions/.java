class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer> hash = new HashMap<>();
        int sum=0, prev=Integer.MAX_VALUE;
        String result = null;
        
        for(int i=0;i< list1.length;i++){
            hash.put(list1[i],i);
        }
        for (int i=0;i<list2.length;i++){
            if(hash.containsKey(list2[i])){
                sum = i + hash.get(list2[i]);
                if(prev>sum){
                    prev = sum;
                    result = list2[i];
                } else if(prev == sum){
                    prev = sum;
                    result += "  "+list2[i];
                }
            }
        }
        return result.split("  ");
    }
}

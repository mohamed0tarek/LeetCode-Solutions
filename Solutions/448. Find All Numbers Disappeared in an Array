class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] arr = new int[nums.length + 1];
        for (int x : nums)
            arr[x]++;

        ArrayList disappeared = new ArrayList();
        for (int i =1 ; i< arr.length;i++)
            if(arr[i] == 0)
                disappeared.add(i);
            
        return disappeared;
    }
}

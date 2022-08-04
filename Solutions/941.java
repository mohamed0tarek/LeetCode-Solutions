class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3) return false;
        int i=0;
        while (i<arr.length-1 && arr[i]<arr[i+1])
            i++;
        int j = (i<arr.length-1 && i>0)?i+1:arr.length+1;
        while (j<arr.length && arr[j]<arr[j-1])
            j++;
        if(j==arr.length)
            return true;
        return false;
    }
}

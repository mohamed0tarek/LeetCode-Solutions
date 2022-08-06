class Solution {
    public int[] replaceElements(int[] arr) {
        int temp1,temp2,i=arr.length-2;
        temp1 = arr[i+1];
        arr[i+1] = -1;
        while (i >= 0){
            temp2 = arr[i];
            arr[i] = Math.max(arr[i+1],temp1);
            temp1 = temp2;
            i--;
        }
        return arr;
    }
}

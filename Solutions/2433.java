
 public int[] findArray(int[] pref) {
     int[] arr = new int[pref.length];
     arr[0] = pref[0];
     int recentXOR = arr[0];
     for (int i = 1 ; i< pref.length; i++){
         arr[i] = recentXOR ^ pref[i];
         recentXOR ^= arr[i];
     }
     return arr;
 }

--------------------------------------------------
  
 public int[] findArray(int[] A) {
       for (int i = A.length - 1; i > 0; --i)
           A[i] ^= A[i - 1];
       return A;
   }

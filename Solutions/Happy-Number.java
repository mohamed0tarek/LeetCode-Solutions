class Solution {
    public boolean isHappy(int n) {
        if(n == 0)
            return false;
        if(n == 1)
            return true;
        Set<Integer> s = new HashSet<>();
        s.add(n);
        while(n!=1)
        {
            int num = 0;
            while(n>0)
            {
                int rem = n%10;
                num += Math.pow(rem,2);
                n = n/10;
            }
            if(num == 1)
                return true;
            n = num;
            if(s.contains(n))
                return false;
            s.add(n);
        }
        return n == 1? true:false;
    }
}

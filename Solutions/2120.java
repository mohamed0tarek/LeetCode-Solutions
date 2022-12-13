class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int len = n - 1;
        int[] res = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int x = startPos[0];
            int y = startPos[1];
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (ch == 'R') y++;
                else if (ch == 'L') y--;
                else if (ch == 'U') x--;
                else x++;
                if (x >= 0 && x <= len && y >= 0 && y <= len) res[i]++;
                else break;
            }
        }
        return res;
    }
}

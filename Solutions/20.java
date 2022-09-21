class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{')
                stack.push(c);
            else if (!stack.isEmpty() && (stack.peek() == c - 1 || stack.peek() == c - 2))
                stack.pop();
            else
                return false;
        }
        return stack.isEmpty();
    }
}

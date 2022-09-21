class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String token : tokens) {
            if (!token.equals("*") && !token.equals("+") && !token.equals("-") && !token.equals("/"))
                stack.push(Integer.parseInt(token));
            else {
                int temp = 0;
                int prior = 0;
                switch (token) {
                    case "*" -> temp = stack.pop() * stack.pop();
                    case "+" -> temp = stack.pop() + stack.pop();
                    case "-" -> {prior = stack.pop(); temp = stack.pop() - prior;}
                    case "/" -> {prior = stack.pop(); temp = stack.pop() / prior;}
                }
                stack.push(temp);
            }
        }
        return stack.pop();
    }
}

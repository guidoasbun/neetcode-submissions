class Solution {
    public int evalRPN(String[] tokens) {
        // Use a stack to put in the tokens, 
        // Example [ 4, 13, 5, /, + ]
        // Stack = 4 | 13 | 5 | operator is /
        // Stack = 4 | 2 | operator is +
        // Stack = 6

        // Edge Cases 
        if (tokens == null || tokens.length == 0) return 0;

        // Initialize a stack to put in the tokens
        Stack<Integer> stack = new Stack<>();

        // Iterate through all elements in the array tokens
        for (String token : tokens) {
            if (isOperator(token)) {
                int b = stack.pop();
                int a = stack.pop();
                int result = completeOperation(token, a, b);
                stack.push(result);
            }
            else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    private boolean isOperator(String token) {
        return (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/"));
    }

    private int completeOperation(String operator, int a, int b) {
        switch (operator) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b;
            default: throw new IllegalArgumentException("Invalid Operator");
        }
    }
}
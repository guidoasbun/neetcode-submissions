class Solution {
    public boolean isValid(String s) {
        // Edge Cases
        if (s.length() == 0 || s == null) return false;

        // Initialize a stack
        Stack<Character> stack = new Stack<>();

        // Iterate through all characters in s
        for (char c : s.toCharArray()) {
            // Use a switch case statement and push in the closing if a opening is c 
            switch (c) {
                case '(':
                    stack.push(')');
                    break;
                case '[':
                    stack.push(']');
                    break;
                case '{':
                    stack.push('}');
                    break;
            // if the closing is c check if empty or if stack != c then return false
                case ')':
                case ']':
                case '}':
                    if (stack.isEmpty() || stack.pop() != c) return false;
                    break;
            }
        }
        return stack.isEmpty();
    }
}
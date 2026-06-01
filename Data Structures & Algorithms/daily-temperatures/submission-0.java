class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //739
        // Strategy is to use a stack to store the index of the temperatures
        // 
        // Edge Cases
        // get the length of the temperatures array
        int n = temperatures.length;
        if (temperatures == null || n == 0) return new int[]{};

        // Initialize the stack
        Stack<Integer> stack = new Stack<>();

        // Initialize the answer array
        int[] answer = new int[n];

        // Iterate through all temperatures
        for (int i = 0; i < n; i++) {
            // while stack is not empty and the current temperature is greater than the top of the stack
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                // get the index from the stack
                int index = stack.pop();
                // assign the days on the answer array
                answer[index] = i - index;
            }
            // push the index to the stack
            stack.push(i);
        }
        
        // return answer
        return answer;
    }
}
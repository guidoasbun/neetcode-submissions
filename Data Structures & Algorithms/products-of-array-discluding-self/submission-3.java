class Solution {
    public int[] productExceptSelf(int[] nums) {
        //238
        // Time O(2*n)
        // Space O(1)
        // Initialize variables
        int[] result = new int[nums.length];
        Arrays.fill(result, 1);
        int prefix = 1;
        int postfix = 1;

        // Run prefix
        for (int i = 0; i < nums.length; i++) {
            result[i] = prefix;
            prefix = nums[i] * prefix;
        }

        // Run Postfix
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] = result[i] * postfix;
            postfix = postfix * nums[i];
        }

        return result;
    
        
    }
}  

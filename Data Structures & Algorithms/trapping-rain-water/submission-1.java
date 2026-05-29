class Solution {
    public int trap(int[] height) {
        // 42
        // Edge cases
        if (height == null || height.length == 0) return 0;

        // Initialize the left and right pointers and the total
        int left = 0, right = height.length - 1, total = 0;

        // Initialize the leftMax and the rightMax to start
        int leftMax = height[left];
        int rightMax = height[right];

        // While loop where left < right
        while (left < right) {
            // Check which side has the lower height, will work on that side, left side
            if (height[left] < height[right]) {
                // Update left max
                leftMax = Math.max(leftMax, height[left]);
                // Check to see if we are at a valley
                if (leftMax - height[left] > 0) {
                    // update the total
                    total = total + leftMax - height[left];
                }
                // Update left pointer to the right
                left++;
            } else { // Same process for the right side
                // Update the max
                rightMax = Math.max(rightMax, height[right]);
                // Check to see if we are at a valley
                if (rightMax - height[right] > 0) {
                    // update the total
                    total = total + rightMax - height[right];
                }
                // Update the left pointer
                right--;
            }
        }
        // return total
        return total;
    }
}

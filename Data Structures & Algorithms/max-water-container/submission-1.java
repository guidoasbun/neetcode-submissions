class Solution {
    public int maxArea(int[] height) {
        // 11
        // We will use double pointers to measure the area
        // Edge cases
        if (height == null || height.length == 0) return 0;

        // Initialize the pointers and max
        int left = 0, right = height.length - 1, max = 0;

        // while loop if left < right
        while (left < right) {
            // initialize the height being the lower number
            int h = Math.min(height[left], height[right]);
    
            // initialize the length
            int l = right - left;

            // Assign the max as the largest area
            max = Math.max(max, l * h);

            // see which one, left or right is bigger, we want the bigger to stay
            if (height[left] < height[right]) left++;
            else right--;
        }
        // return max
        return max;
    }
}

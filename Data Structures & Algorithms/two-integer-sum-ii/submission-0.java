class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // 167
        // Edge cases
        if (numbers == null || numbers.length == 0) return new int[]{};

        // Initialize left and right pointers
        int left = 0, right = numbers.length - 1;

        // While loop if left < right
        while (left < right) {
            // Define the current sum
            int currentSum = numbers[left] + numbers[right];   

            // Check if the currentSum is the target, return index + 1
            if (currentSum == target) return new int[]{left + 1, right + 1};
            // if current sum < target add one to left
            else if (currentSum < target) left++;
            // else if current sum > target less one to right
            else right--;
        }
        // return empty array
        return new int[]{};
    }
}

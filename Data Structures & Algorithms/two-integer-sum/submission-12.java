class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Checks for edge cases
        if (nums.length < 1) return new int[]{};

        // Initializes the map to store the numbers and index
        Map<Integer, Integer> myMap = new HashMap<>();

        // Loop that goes through all elements of the array
        for (int i = 0; i < nums.length; i++) {
            // Gets the complement
            int complement = target - nums[i];
            // If the complement was already seen, return its index and the current index
            if (myMap.containsKey(complement)) return new int[]{myMap.get(complement), i};
            // Store the current element and the index
            myMap.put(nums[i], i);
        }

        // Return empty array if no pair found
        return new int[]{};
    }
}

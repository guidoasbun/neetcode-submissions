class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Initialize a HashMap <key -> number, value -> index>
        Map<Integer, Integer> map = new HashMap<>(nums.length);

        // Go through all ints in nums using for, int loop to get index
        for (int i = 0; i < nums.length; i++) {
            // Get the complements target - nums at index
            int complement = target - nums[i];

            // check if the complement is in the map
            if (map.containsKey(complement)) {

                // if complement is in map, RETURN value of nums and current index 
                return new int[]{map.get(complement),i};
            }
            // complement is not in map, ADD to map < number, index >
            map.put(nums[i], i);
    
        }
        // Return empty array
        return new int[]{};
    }
}

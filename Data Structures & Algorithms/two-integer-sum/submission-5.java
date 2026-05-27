class Solution {
    public int[] twoSum(int[] nums, int target) {
        // 1
        // Edge cases
        if (nums.length == 0) return new int[]{};

        // Initalize a map
        Map<Integer, Integer> seenNums = new HashMap<>(nums.length);

        // Iterate through all the nums, create a complement.
        // Create a complement
        // Check if complement is in map
        // if so, return index. if not add to map<number, index>
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (seenNums.containsKey(complement)) return new int[]{seenNums.get(complement) , i};

            seenNums.put(nums[i], i);
        }

        // return empty array default
        return new int[]{};
    }
}

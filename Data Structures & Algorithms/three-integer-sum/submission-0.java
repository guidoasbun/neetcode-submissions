class Solution {
    // 15
    public List<List<Integer>> threeSum(int[] nums) {
        // Edge Cases
        if (nums == null || nums.length == 0) return new ArrayList<>();

        // Sort the nums array
        Arrays.sort(nums);

        // Initialize result List
        List<List<Integer>> result = new ArrayList<>();

        // Iterate through the nums untill value is <= 0
        for (int i = 0; i < nums.length && nums[i] <= 0; i++) {
            // Check if i is 0 (the starting val) or of the val is the previous val
            // then run the two sum method
            if (i == 0 || nums[i] != nums[i-1]) twoSumTwo(nums, i, result);
        }
        // retrun the result
        return result;
    }

    void twoSumTwo(int[] nums, int i, List<List<Integer>> result) {
        // Initialize left and right pointers
        int left = i+1, right = nums.length - 1;

        // Use while loop l < r
        while (left < right) {
            // Initialize the sum of all 3
            int sum = nums[i] + nums[left] + nums[right];

            // if sum < 0, move the left 1 to the right
            if (sum < 0) left++;
            // else if sum is > 0, move right 1 to the left
            else if (sum > 0) right--;
            // else if the sum is 0, add to result
            else {
                result.add(Arrays.asList(nums[i], nums[left++], nums[right--]));
                while(left < right && nums[left] == nums[left-1]){
                    ++left;
                }
            }
        }
    }
}
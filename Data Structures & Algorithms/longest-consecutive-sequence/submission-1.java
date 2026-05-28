class Solution {
    public int longestConsecutive(int[] nums) {
        //128
        // Edge Cases
        if (nums == null || nums.length == 0) return 0;

        // Initialize a hashset and place all nums in Set
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        // Initialize the longest to 1
        int longest = 1;

        // Iterate through all elements in numSet
        for (int num : numSet) {
            // check to see if the number is in the middle of the sequence 
            if (numSet.contains(num-1)) continue;
            else {
                // Initialize currentNum
                int currentNum = num;
                // initialize current substring length
                int currentSub = 1;
                // Increment the currentSub and currentSub if the currentNum contains a +1
                while (numSet.contains(currentNum+1)) {
                    currentNum++;
                    currentSub++;
                }
                longest = Math.max(longest, currentSub);
            }
        }
        // return the longest
        return longest;
    }
}

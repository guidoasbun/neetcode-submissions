class Solution {
    public int longestConsecutive(int[] nums) {
            if (nums.length == 0) {
            return 0;
        }

        HashSet<Integer> numSet = new HashSet<>();
        for (Integer num : nums) {
            numSet.add(num);
        }

        int longestSub = 1;

        for (Integer num : numSet) {
            if (numSet.contains(num - 1)) {
                continue;
            }
            else {
                Integer currentNum = num;
                Integer currentSub = 1;
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentSub++;
                }

                longestSub = Math.max(longestSub, currentSub);
            }
        }
        return longestSub;
    }
}

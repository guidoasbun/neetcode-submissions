class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums.length == 0) return false;

        HashSet<Integer> seenNums = new HashSet<>();

        for (int num : nums) {
            if (seenNums.contains(num)) return true;
            seenNums.add(num);
        } 
        return false;
    }
}
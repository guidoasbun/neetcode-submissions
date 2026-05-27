class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // 347
        // If k is equal to the total number of elemnts in the input, every
        // element is a "top frequent element"
        if (k == nums.length) {
            return nums;
        }

        // Iterate through nums and build a frequency map
        // check if number exists, if it does, it adds 1 to current 
        // count
        Map<Integer, Integer> count = new HashMap<>();
        for (int n : nums) {
            count.put(n, count.getOrDefault(n,0) + 1);
        }

        // Initialize Priority queue
        // Comparator - tells the heap to order elements 
        // based on their frequencies in ascending order
        Queue<Integer> heap = new PriorityQueue<>(
            (a,b) -> count.get(a) - count.get(b)
        );

        // Iterates throuth every unique number in map
        // pushes the current number into the heap
        // kiks out - if the heap size exceeds k
        // removes the top element - poll() removes the 
        // element with the lowest frequency in the heap
        for (int n : count.keySet()) {
            heap.add(n);
            if (heap.size() > k) {
                heap.poll();
            }
        }

        // Builds the result array

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = heap.poll();
        }

        return ans;
        
    }
}

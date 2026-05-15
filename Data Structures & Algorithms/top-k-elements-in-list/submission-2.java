class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // 1. Save each element's appearance (frequency) in a map
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
        frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // 2. Use an array of lists as buckets where the index is the frequency
        List<Integer>[] buckets = new List[nums.length + 1];
        for (int key : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(key);
            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(key);
        }

        // 3. Gather the top k elements by traversing the buckets backwards
        int[] res = new int[k];
        int counter = 0;
        
        for (int i = buckets.length - 1; i >= 0; i--) {
            if (buckets[i] != null) {
                for (int num : buckets[i]) {
                    res[counter++] = num;
                    if (counter == k) {
                        return res;
                    }
                }
            }
        }

    return res;
    }
}

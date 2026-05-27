class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Edge Cases
        if (strs == null || strs.length == 0) return new ArrayList<>();

        // Initialize an array of size 26 because there are 26 letters in the English alphabet
        int[] signature = new int[26];

        // Initialize a HashMap to store the signature of each string as String
        // And the values as a List of Strings
        Map<String, List<String>> map = new HashMap<>();

        // Iterate through the array of strings
        for (String str : strs) {
            // Reset the signature of the signature array to 0
            Arrays.fill(signature, 0);

            // Iterate through all characters in the string and create the signature
            for (char c : str.toCharArray()) {
                signature[c - 'a']++;
            }
            // Use string builder to create the signature value
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                sb.append(signature[i]);
                sb.append("#");
            }

            // Build the key from sb
            String key = sb.toString();

            // Check to see if the key is in the map
            if (!map.containsKey(key)) map.put(key, new ArrayList<>());

            // Add the string to the list of strings for the key
            map.get(key).add(str);

        }

        return new ArrayList<>(map.values());

    }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //49
        // Edge cases
        if (strs.length == 0) return new ArrayList<>();

        // Create an array of 26 for signature
        // Create a Hashmap Key->Signature, Value->Set of strs
        int[] signature = new int[26];
        Map<String, List<String>> map = new HashMap<>(strs.length);

        // Iterate through all strs in string array
        for (String str : strs) {

            // clear the signature to defalult 0
            Arrays.fill(signature, 0);

            // Iterate through all the characters in strs and create signature in signature
            for (char c : str.toCharArray()) signature[c - 'a']++;

            // Create and use stringbuilder to create a string key and seperate with '#'
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++){
                sb.append(signature[i]);
                sb.append('#');
            }

            // build the key from sb
            String key = sb.toString();

            // check to see if the key is in the map
            // if so, add to value set, if not, add new key with empty set
            if (!map.containsKey(key)) map.put(key, new ArrayList<>());
            map.get(key).add(str);

        }
        
        // Return all the values of the Map
        return new ArrayList<>(map.values());

    }
}

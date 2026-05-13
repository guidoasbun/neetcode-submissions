class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Check if the str is empty, return empty Array List if so
        if (strs.length == 0) return new ArrayList<>();

        // Inititalize a Map key -> String , value -> List<String>
        Map<String, List<String>> map = new HashMap<>();

        // Initialize int[] charCount array of 26, becuase there are 26 characters in alphabet
        int[] charCount = new int[26];

        // Go through all Strings in String[] array
        for (String str : strs) {

            // for every string
            // reset all charCount to 0 , fill
            Arrays.fill(charCount, 0);

            // set charCount to add 1 for each character 
            for (char c : str.toCharArray()) {
                charCount[c - 'a']++;
            }

            // Initialize String Builder
            StringBuilder sb = new StringBuilder("");

            // Create string and seperate each of charCount with a '#' and add the number as character
            for (int i = 0; i < 26; i++) {
                sb.append('#');
                sb.append(charCount[i]);
            }

            // create String key from SB
            String key = sb.toString();

            // check if map not contains key, if not, put key and ArrayList
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
                
            } 
            // if it does, add the str
            map.get(key).add(str);
            
        }
            
        // return List of values from map
        return new ArrayList(map.values());

    }
}

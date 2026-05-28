class Solution {
    // 271
    // Encodes a list of strings to a single string.

    // Strategy is to put in a character greater than 256 between the strs

    public String encode(List<String> strs) {
        // Edge cases
        if (strs.size() == 0 || strs == null) return Character.toString((char)258);

        // Define string that is going to be the seperator
        String seperator = Character.toString((char)257);

        // Use String Builder to build the string
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s);
            sb.append(seperator);
        }
        // remove the last character fo the sb
        sb.deleteCharAt(sb.length()-1);

        // return the string
        return sb.toString();

    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        // If string is invalid, return empty
        if (s.equals(Character.toString((char)258))) return new ArrayList<>(); 

        // Define string that is going to be the seperator
        String seperator = Character.toString((char)257);

        // retrun the decoded string
        return Arrays.asList(s.split(seperator, -1));
    }
}

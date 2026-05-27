class Solution {
    public boolean isAnagram(String s, String t) {
        // Edge Cases
        if ( s == null || t == null || s.length() != t.length() ) return false;

        // Initialize an array of size 26 because there are 26 letters in the English alphabet
        int[] count = new int[26];

        // Iterate through the string s and increment the count of each character
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        // Iterate through the string t and decrement the count of each character
        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i) - 'a']--;
        }
        // Iterate through the count array and check if any count is non-zero
        for (int c : count) {
            if(c !=0 ) return false;
        }
        return true;
    }
}

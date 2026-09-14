class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] characterCounts = new int[26];

        for (int index = 0; index < s.length(); index++) {
            characterCounts[s.charAt(index) - 'a']++;
            characterCounts[t.charAt(index) - 'a']--;
        }

        for (int num : characterCounts) {
            if (num != 0) return false;
        }  

        return true;
    }
}

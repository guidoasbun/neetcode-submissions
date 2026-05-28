class Solution {
    public boolean isPalindrome(String s) {
        // 125
        // Edge Cases
        if (s == null || s.length() == 0) return false;

        // Initialize the 2 pointers left and right
        int left = 0, right = s.length() - 1;

        // While loop left < right
        while (left < right) {
            // Assign the characters we are looking at
            char l = s.charAt(left);
            char r = s.charAt(right);

            // Check to see if the characters are not valid, increment or decrement left right
            if (!Character.isLetterOrDigit(l)) left++;
            else if (!Character.isLetterOrDigit(r)) right--;
            // If characters are valid, check to see if they are not equal to each other (convert to lowercase), return false;
            else {
                if (Character.toLowerCase(l) != Character.toLowerCase(r)) return false;
                // if they are equal to each other, increment left, decrement right
                left++;
                right--;
            }
        }
        // retrun true
        return true;
    }
}

class Solution {

    // constant 9 board length and width
    public static final int N = 9;

    public boolean isValidSudoku(char[][] board) {
        // 36
        // Strategy is to use 9 hashsets for rows, columns and boxes
        // Edge cases
        if (board == null || board.length == 0) return false;
        
        // Create an Array of Hashmaps with length of 9
        HashSet<Character>[] rows = new HashSet[N];
        HashSet<Character>[] cols = new HashSet[N];
        HashSet<Character>[] boxes = new HashSet[N];

        // Initialize the HashSets
        for (int i = 0; i < N; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        // Iterate over rows
        for (int r = 0; r < N; r++) {
            // Iterate over cols
            for (int c = 0; c < N; c++) {
                // Assign the value of the character looking at
                char val = board[r][c];

                // Check if the position is a number, if not, continue
                if (val == '.') continue;

                // Check the rows
                if (rows[r].contains(val)) return false;
                rows[r].add(val);

                // Check the cols
                if (cols[c].contains(val)) return false;
                cols[c].add(val);

                // Check the box
                // create the index of box rows / 3 * 3 + cols / 3
                int idx = (r/3) * 3 + (c/3);
                if (boxes[idx].contains(val)) return false;
                boxes[idx].add(val); 
            }
        }
        // retrun true
        return true;
    }
}

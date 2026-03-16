import java.util.ArrayList;
import java.util.List;

class Solution {
    // Step 1: Keypad mapping-a inga add panrom
    private static final String[] KEYPAD = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>(); // <> use panrathu best practice
        
        if (digits == null || digits.length() == 0) {
            return result; // Correction: digits-ku pathila result-a return panrom
        }
        
        // Step 2: Backtrack function-a call panrom
        backtrack(result, new StringBuilder(), digits, 0);
        
        return result;
    }

    // Step 3: Backtrack logic-a ezhudhurom
    private void backtrack(List<String> result, StringBuilder currentPath, String digits, int index) {
        if (index == digits.length()) {
            result.add(currentPath.toString());
            return;
        }

        int digit = digits.charAt(index) - '0';
        String letters = KEYPAD[digit];

        for (char letter : letters.toCharArray()) {
            currentPath.append(letter);
            backtrack(result, currentPath, digits, index + 1);
            currentPath.deleteCharAt(currentPath.length() - 1);
        }
    }
}
import java.util.Arrays;
import java.util.Stack;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        
        Stack<Integer> stack = new Stack<>();
        
        // TRICK 1: Loop runs for 2 * n times! (Rendu round varom)
        for (int i = 0; i < 2 * n; i++) {
            
            // TRICK 2: Modulo magic to wrap around
            // Example: i = 3, n = 3 -> 3 % 3 = 0 (Starts from beginning again)
            int currentIndex = i % n; 
            int currentNumber = nums[currentIndex];
            
            // The exact same BOUNCER rule you wrote!
            while (!stack.isEmpty() && currentNumber > nums[stack.peek()]) {
                int poppedIndex = stack.pop();
                result[poppedIndex] = currentNumber;
            }
            
            // TRICK 3: First round la mattum thaan aalungala waiting room la (stack la) vidanum.
            // Second round varumbothu, erkanave wait panravangala thuratha mattum thaan round varom, 
            // puthusa yarayum ulla anupakoodathu!
            if (i < n) {
                stack.push(currentIndex);
            }
        }
        
        return result;
    }
}
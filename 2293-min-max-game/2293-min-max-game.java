class Solution {
    public int minMaxGame(int[] nums) {
        int n = nums.length;
        
        // Continue the process until only 1 element remains
        while (n > 1) {
            // Create the new array with half the length
            int[] newNums = new int[n / 2];
            
            // Populate the new array based on the alternating min/max rules
            for (int i = 0; i < n / 2; i++) {
                if (i % 2 == 0) {
                    newNums[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
                } else {
                    newNums[i] = Math.max(nums[2 * i], nums[2 * i + 1]);
                }
            }
            
            // Replace the old array with the new array and update n
            nums = newNums;
            n = nums.length;
        }
        
        // The last remaining number is at index 0
        return nums[0];
    }
}
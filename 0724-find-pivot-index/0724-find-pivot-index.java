class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;
        
        // Step 1: Array-la irukka ellathoda total sum-ah kandupudikurom
        for (int num : nums) {
            totalSum += num;
        }
        
        // Step 2: Ovvoru index-a check panrom
        for (int i = 0; i < nums.length; i++) {
            // Right sum formula: Total - LeftSum - CurrentNumber
            int rightSum = totalSum - leftSum - nums[i];
            
            // Rendum equal-ah irundha, adhu dhaan pivot!
            if (leftSum == rightSum) {
                return i;
            }
            
            // Equal illana, current number-ah leftSum-la add pannitu adutha index-ku porom
            leftSum += nums[i];
        }
        
        // Endha index-um match aagalana -1 return panrom
        return -1;
    }
}
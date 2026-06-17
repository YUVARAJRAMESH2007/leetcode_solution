import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        
        // Step 1: Array-va sort panrom
        Arrays.sort(nums);

        // Step 2: First number-a fix panrom
        for (int i = 0; i < nums.length; i++) {
            
            // First number 0-va vida perusa irundha sum 0 varadhu, so break panrom
            if (nums[i] > 0) {
                break;
            }
            
            // Duplicate first numbers-a skip panrom
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Step 3: Two Pointers setup
            int left = i + 1;
            int right = nums.length - 1;

            // Step 4: Pointers-a move panni sum check panrom
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum > 0) {
                    // Sum adhigama irukku, so right pointer-a korakkurom
                    right--;
                } else if (sum < 0) {
                    // Sum kammia irukku, so left pointer-a ethurom
                    left++;
                } else {
                    // Sum 0 vandhuduchu! Answer-a list-la add panrom
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    left++;
                    right--;

                    // Left-la duplicate numbers irundha skip panrom
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                }
            }
        }
        
        return res;
    }
}
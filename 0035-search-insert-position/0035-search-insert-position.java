class Solution {
    public int searchInsert(int[] nums, int target) {
        int i;
        int count=0;
        for( i=0;i<nums.length;i++){
            if(nums[i]==target){
                count=i;
                
            }
            else if(nums[i]<target){
                count++;
            }
            
        }
        return count;
        
        
        
    }
}
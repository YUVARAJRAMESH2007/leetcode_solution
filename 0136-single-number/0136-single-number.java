class Solution {
    public int singleNumber(int[] nums) {
        int unq=0;
        for(int i=0;i<nums.length;i++){
            unq^=nums[i];
        }
        return unq;
        
    }
}
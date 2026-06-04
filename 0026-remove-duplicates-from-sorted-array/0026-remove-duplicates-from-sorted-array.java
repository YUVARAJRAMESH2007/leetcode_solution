class Solution {
    public int removeDuplicates(int[] nums) {
      int ind = 0 ;
      for(int i = 1;i< nums.length ; i++){
        if( nums[ind] != nums[i]){
            nums[ind+1] = nums[i];
            ind++;
        }
        
      }
      return ind+1;
    }
}
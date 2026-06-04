class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int ind=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[ind++]=nums[i];
            }
           



        }
        nums[ind++]=nums[nums.length-1];
        if(ind<3){
            return nums[ind-1];
        }
        else{
            return nums[ind-3];
        }
        
    }
}
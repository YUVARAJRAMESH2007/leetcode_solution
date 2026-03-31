class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total=0;

        int currentmax=0,maxsum=nums[0];
        int currentmin=0,minsum=nums[0];
        for(int num:nums){
            total+=num;
            currentmax=Math.max(currentmax+num,num);
            maxsum=Math.max(maxsum,currentmax);
            currentmin=Math.min(currentmin+num,num);
            minsum=Math.min(minsum,currentmin);
        }
            if(maxsum<0){
                return maxsum;
            }
        
        return Math.max(maxsum,total-minsum);
    }
}
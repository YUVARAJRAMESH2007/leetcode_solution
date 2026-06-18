class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg=0;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double max=(double)sum/k;

        for(int i=k;i<nums.length;i++){
            sum+=nums[i];
            sum-=nums[i-k];
            avg=(double)sum/k;
            if(max<avg){
                max=avg;
            }


        }
        return max;

       
    }
}

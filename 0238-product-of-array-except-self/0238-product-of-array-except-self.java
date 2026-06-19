class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int prefix[]=new int[nums.length];
        // prefix[0]=1;
        // int suffix[]=new int[nums.length];
        // for(int i=1;i<nums.length;i++){
        //     prefix[i]=nums[i-1]*prefix[i-1];
        // }
        // suffix[nums.length-1]=1;
        // for(int i=nums.length-2;i>=0;i--){
        //     suffix[i]=nums[i+1]*suffix[i+1];
        // }
        // for(int i=0;i<nums.length;i++){
        //     nums[i]=prefix[i]*suffix[i];
        // }
        // return nums;
        int n=nums.length;
        int ans[]=new int[n];
        ans[0]=1;
        for(int i=1;i<n;i++){
            ans[i]=nums[i-1]*ans[i-1];
        }
        int rightproduct=1;
        for(int i=n-1;i>=0;i--){
            ans[i]=ans[i]*rightproduct;
            rightproduct=rightproduct*nums[i];
        }
        return ans;
        
    }
}
class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int arr[]=new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        for(int i=nums.length, j=0;j<nums.length;j++,i++){
            arr[i]=nums[j];
        }
        return arr;
    }
}
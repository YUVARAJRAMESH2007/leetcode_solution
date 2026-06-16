class Solution {
    public int maxArea(int[] height) {
        
        int left=0;
        int right=height.length-1;
        int max=0;
        while(left<right){
            int currentwidth=right-left;
            int currentheight=Math.min(height[left],height[right]);
            int currentArea=currentwidth*currentheight;
            max=Math.max(max,currentArea);
            if(height[left]<height[right]){
                left++;
            } 
            else{
                right--;
            }

        }
        return max;
    }
}
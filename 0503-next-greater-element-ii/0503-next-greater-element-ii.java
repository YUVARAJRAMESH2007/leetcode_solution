import java.util.Arrays;
import java.util.Stack;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int result[]=new int[n];
        Stack<Integer> stack=new Stack<>();
        for(int i=2*n-1;i>=0;i--){
            int currentIndex=i%n;
            int currentnum=nums[currentIndex];
            while(!stack.isEmpty() && stack.peek()<=currentnum){
                stack.pop();
            }
            if(i<n){
                if(stack.isEmpty()){
                    result[currentIndex]=-1;
                }
                else{
                    result[currentIndex]=stack.peek();
                }

            }
            stack.push(currentnum);

        }
        return result;
    }
}
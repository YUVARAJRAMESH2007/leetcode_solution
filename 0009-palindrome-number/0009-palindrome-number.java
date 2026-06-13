class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int rev=0;

        if(x<0){
            return false;
        }
        else{
           
            while(x!=0){
                int digits=x%10;
                rev=rev*10+digits;
                x=x/10;
            }

        }
        if(temp==rev){
            return true;
        }
        return false;
    }
}
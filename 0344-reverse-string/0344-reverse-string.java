class Solution {
    public void reverseString(char[] s) {
        int ind=0;
        
       for(int i=s.length-1;ind<i;i--){
        char temp=s[ind];
        s[ind]=s[i];
        s[i]=temp;
        ind++;

        

       }
        
    }
}
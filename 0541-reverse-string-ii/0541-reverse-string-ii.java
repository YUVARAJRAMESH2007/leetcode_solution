class Solution {
    public String reverseStr(String s, int k) {
        char st[]=s.toCharArray();
        for(int i=0;i<st.length;i+=2*k){
            int left=i;
            int right=Math.min(i+k-1,st.length-1);
            while(left<right){
                char temp=st[left];
                st[left]=st[right];
                st[right]=temp;
                left++;
                right--;
            }

        }
        return new String(st);
        
        
    }
}
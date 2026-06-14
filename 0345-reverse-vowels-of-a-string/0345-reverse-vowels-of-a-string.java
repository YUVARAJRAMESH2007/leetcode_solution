class Solution {
    public String reverseVowels(String s) {
        char st[]=s.toCharArray();
        int left=0;
        int right=st.length-1;
        while(left<right){
            while(left<right && !isVowel(st[left])){
                left++;
            }
            while(left<right &&!isVowel(st[right])){
                right--;
            }
            if(left<right){
                char temp=st[left];
                st[left]=st[right];
                st[right]=temp;
            }
            left++;
            right--;
        }
        return new String(st);
    }
        private boolean isVowel(char c){
            return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
        }
        

        
}
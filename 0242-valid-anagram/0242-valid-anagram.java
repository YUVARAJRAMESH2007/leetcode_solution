class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char st[]=s.toCharArray();
        char st1[]=t.toCharArray();
        Arrays.sort(st);
        Arrays.sort(st1);
        for(int i=0;i<st.length;i++){
            if(st[i]!=st1[i]){
                return false;
            }
        }
        return true;
        
    }
}
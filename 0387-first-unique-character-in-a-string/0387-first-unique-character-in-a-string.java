class Solution {
    public int firstUniqChar(String s) {
        int  st[]=new int[26];
        int count=-1;
        for(int i=0;i<s.length();i++){
           char c=s.charAt(i);
           st[c-'a']++;
    }
    for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(st[c-'a']==1){
            return i;
        }
    }
    return -1;
    }
}
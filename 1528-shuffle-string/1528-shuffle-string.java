class Solution {
    public String restoreString(String s, int[] indices) {
        int len=s.length();
        StringBuilder sb=new StringBuilder("");
        char c[]=new char[len];
        for(int i=0;i<len;i++)
        {
            c[indices[i]]=s.charAt(i);
        }
        sb.append(c);
        return sb.toString();
        
    }
}
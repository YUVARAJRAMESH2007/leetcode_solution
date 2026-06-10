class Solution {
    public String sortSentence(String s) {
        String sp[]=s.split(" ");
        String res[]=new String[sp.length];
        for(String word:sp){
            int len=word.length();
            int pos=word.charAt(len-1)-'1';
            res[pos]=word.substring(0,len-1);


        }
        return String.join(" ",res);
        
    }
}
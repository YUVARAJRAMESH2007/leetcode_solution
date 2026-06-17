class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count;
        int res=0;
        for(int i=0;i<s.length();i++){
            count=0;
            boolean []arr=new boolean[256];
            for(int j=i;j<s.length();j++){
                if(arr[s.charAt(j)]==true){
                    break;
                }
                else{
                    count++;
                    arr[s.charAt(j)]=true;
                }
            }
            res=Math.max(res,count);
        }
        return res;
        
    }
}
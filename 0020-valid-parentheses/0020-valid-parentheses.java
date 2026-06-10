class Solution {
    public boolean isValid(String s) {
        char st1[]= s.toCharArray();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(st1[i]=='('){
                st.push(')');
            }
            else if(st1[i]=='{'){
                st.push('}');
            }
            else if(st1[i]=='['){
                st.push(']');
            }
            else if(st.isEmpty()||st.pop()!=st1[i]){
                return false;

            }
        }
        return st.isEmpty();
        
    }
}
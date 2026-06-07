class Solution {
    public boolean isPalindrome(String s) {
        String cleaned=s.toLowerCase().replaceAll("[^a-z0-9]","");
        String rev=new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(rev);

        
    }
}
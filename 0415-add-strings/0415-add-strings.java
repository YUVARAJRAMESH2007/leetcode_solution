import java.math.BigInteger;

class Solution {
    public String addStrings(String num1, String num2) {
        // 1. Convert the Strings directly into massive BigInteger objects
        BigInteger big1 = new BigInteger(num1);
        BigInteger big2 = new BigInteger(num2);
        
        // 2. Add them together and convert the result back to a String!
        return big1.add(big2).toString();
    }
}
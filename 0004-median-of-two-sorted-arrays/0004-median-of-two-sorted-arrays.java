class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        
        // 1. Rendu array-oda size-a vechu puthu array create pandrom
        int[] merged = new int[m + n];
        
        // 2. Built-in function use panni copy pandrom
        // Syntax: (sourceArray, sourcePos, destArray, destPos, length)
        System.arraycopy(nums1, 0, merged, 0, m);
        System.arraycopy(nums2, 0, merged, m, n);
        
        // 3. Built-in sort use panni sort pandrom
        Arrays.sort(merged);
        
        // 4. Median kandupudikurom
        int total = merged.length;
        
        if (total % 2 == 1) {
            // Odd length na direct-a neduvala irukka number
            return (double) merged[total / 2];
        } else {
            // Even length na neduvala irukka rendu number-oda average
            int mid1 = merged[(total / 2) - 1];
            int mid2 = merged[total / 2];
            return ((double) mid1 + (double) mid2) / 2.0;
        }
    }
}

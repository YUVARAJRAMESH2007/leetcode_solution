class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missing=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=1;i<=n;i++){
            if(Arrays.binarySearch(nums,i)<0){
                missing.add(i);
            }
        }
        return missing;
        
    }
}
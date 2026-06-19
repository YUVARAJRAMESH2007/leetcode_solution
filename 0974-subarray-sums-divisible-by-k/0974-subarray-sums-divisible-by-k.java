class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        int remaindercounts[]=new int[k];
        int subarray=0;
        int runningsum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            runningsum+=nums[i];
            int rem=runningsum%k;
            if(rem<0){
                rem+=k;
            }
            if(hm.containsKey(rem)){
                count+=hm.get(rem);
            }
            hm.put(rem,hm.getOrDefault(rem,0)+1);


        }
        return count;
    }
}
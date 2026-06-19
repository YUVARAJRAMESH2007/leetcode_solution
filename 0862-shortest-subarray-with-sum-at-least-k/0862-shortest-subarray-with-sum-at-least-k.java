class Solution {
    public int shortestSubarray(int[] nums, int k) {
        long prefix[]=new long[nums.length+1];
        int minlen=Integer.MAX_VALUE;
        Deque<Integer> q=new ArrayDeque<>();
        for(int i=1;i<=nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i-1];
        }
        for(int i=0;i<prefix.length;i++){
            while(!q.isEmpty()&& prefix[i]-prefix[q.peekFirst()]>=k){
                minlen=Math.min(minlen,i-q.pollFirst());
            }
            while(!q.isEmpty() && prefix[q.peekLast()]>prefix[i]){
                q.pollLast();
            }
            q.offer(i);

        }
        return minlen==Integer.MAX_VALUE? -1:minlen;
    }
}
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(1<<nums.length);
        back(0,result,nums,new ArrayList<>());
        return result;
    }
    public static void back(int start, List<List<Integer>> result, int[]nums, List<Integer> path){
        result.add(new ArrayList<>(path));
        for(int i = start; i < nums.length; i++){
            path.add(nums[i]);
            back(i+1,result,nums,path);
            path.remove(path.size()-1);
        }
    }
}
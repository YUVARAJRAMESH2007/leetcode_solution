class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int edge[]:edges){
           int cityA = edge[0];
            int cityB = edge[1];
            graph.get(cityA).add(cityB);
            graph.get(cityB).add(cityA);

        }
        boolean[] visited=new boolean[n];

        Queue<Integer> queue=new LinkedList<>();
        visited[source]=true;
        queue.add(source);
        while(!queue.isEmpty()){
            int current=queue.poll();
            if(current==destination){
                return true;
            }
            for(int neighbour:graph.get(current)){
                if(!visited[neighbour]){
                    visited[neighbour]=true;
                    queue.add(neighbour);
                }
            }

        }
        return false;

        
        
    }
}
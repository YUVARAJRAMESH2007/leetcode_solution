class Solution {
    int parent[];
    int rank[];

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        parent=new int[n];
        rank=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
            rank[i]=1;
        }
        for(int edge[]:edges){
            union(edge[0],edge[1]);
        }
        return find(source)==find(destination);

       

        
    }
    void union(int x,int y){
        int rootx=find(x);
        int rooty=find(y);
        if(rootx!=rooty){
            if(rank[rootx]>rank[rooty]){
                parent[rooty]=rootx;

                            }
            else if(rank[rootx]<rank[rooty]){
                parent[rootx]=rooty;
            }
            else{
                parent[rooty]=rootx;
                rank[rootx]++;
            }
        }
    }
    int find(int x){
        if(parent[x]!=x){
            parent[x]=find(parent[x]);
        }
        return parent[x];
    }
}
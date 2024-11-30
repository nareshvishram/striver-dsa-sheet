class Solution {

    int memo[][];
    public int uniquePaths(int m, int n) {
        memo=new int[m][n];
        for(int x[]:memo)
            Arrays.fill(x,-1);
       return memo(m-1,n-1);
    }

    private int memo(int i,int j){
        if(i<0||j<0)
            return 0;
        if(memo[i][j]!=-1)
            return memo[i][j];
        if(i==0 && j==0){
            memo[i][j]=1;
            return 1;
        }
        memo[i][j]= memo(i-1,j)+memo(i,j-1);
        return memo[i][j];
        
    }

    // recursion -- rec(m-1,n-1)
    private int rec(int i,int j){
        if(i<0||j<0)
            return 0;
        if(i==0 && j==0)
            return 1;
        return rec(i-1,j)+rec(i,j-1);
    }



    // backtracking -- dfs(0,0)
    // private void dfs(int i,int j){
    //     if(i<0||j<0||i>=mat.length||j>=mat[0].length||mat[i][j]==1)return;
    //     if(i==mat.length-1 && j==mat[0].length-1)
    //         ans++;
    //     mat[i][j]=1;
    //     dfs(i+1,j);
    //     dfs(i,j+1);
    //     mat[i][j]=0;
    // }
}
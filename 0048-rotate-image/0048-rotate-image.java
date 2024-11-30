class Solution {
    public void rotate(int[][] matrix) {
     // transpose
     int n=matrix.length;
     for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
            int tmp=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=tmp;
        }
     }   
     for(int x[]:matrix)
        System.out.println(Arrays.toString(x));
     // reverse columns
     int l=0,r=n-1;
     while(r>l){
        for(int i=0;i<n;i++){
            int tmp=matrix[i][l];
            matrix[i][l]=matrix[i][r];
            matrix[i][r]=tmp;
        }
        l++;
        r--;
     }
    }
}
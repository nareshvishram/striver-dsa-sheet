class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int leftMax=0,rightMax=0,l=0,r=n-1,ans=0;
        while(l<=r){
            if(height[l]<=height[r]){
                if(leftMax<=height[l])
                    leftMax=height[l];
                else
                    ans+=(leftMax-height[l]);
                l++;
            }else{
                if(rightMax<=height[r])
                    rightMax=height[r];
                else
                    ans+=(rightMax-height[r]);
                r--;
            }
        }
        return ans;
    }
}
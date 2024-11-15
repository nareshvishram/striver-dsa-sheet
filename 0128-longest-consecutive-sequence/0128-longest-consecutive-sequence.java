class Solution {
    public int longestConsecutive(int[] nums) {
     Map<Integer,Integer> map=new HashMap<>();
     for(int x:nums){
        map.put(x,map.getOrDefault(x,0)+1);
     }   
     int res=0;
     for(int i=0;i<nums.length;i++){
        int len=1;
        if(!map.containsKey(nums[i]-1)){
            int start=nums[i];
            while(map.containsKey(start+1)){
                len++;
                start++;
            }
            res=Math.max(len,res);
        }
     }
     return res;
    }
}
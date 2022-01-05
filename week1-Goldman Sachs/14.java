class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0,j=0;
        int sum = 0,n=nums.length;
        int sol = Integer.MAX_VALUE;
        
        while(j<n){
            if(sum<target){
                sum+=nums[j];
                
            }
            
            while(sum>=target){
                sol = Math.min(sol,j-i+1);
                sum-=nums[i];
                i++;
            }            
            j++;
            
        }
        
        return (sol == Integer.MAX_VALUE) ? 0 : sol;
    }
}
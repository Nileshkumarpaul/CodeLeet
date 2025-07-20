class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0, start=0,end=0,result=Integer.MAX_VALUE;
        for(end=0;end<nums.length;end++){
            sum+=nums[end];
            while(sum>=target){
                result=Math.min(result,end-start+1);
                sum-=nums[start++];
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
        
    }
}
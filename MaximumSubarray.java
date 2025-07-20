class Solution {
  public int maxSubArray(int[] nums) {
    int[] temp = new int[nums.length];
    temp[0] = nums[0];
    for (int i = 1; i < nums.length; ++i)
      temp[i] = Math.max(nums[i], temp[i - 1] + nums[i]);
    return Arrays.stream(temp).max().getAsInt();
  }
}
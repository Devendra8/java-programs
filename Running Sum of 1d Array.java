// Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

// Return the running sum of nums.

class Solution {
    public int[] runningSum(int[] nums) {
        
        int[] result = new int[nums.length];
        for(int i =0;i<nums.length;i++){
        int sum = 0;
            for(int j=0;j<i+1;j++){
                sum = sum + nums[j];
                result[i] = sum;
            }
        }
        return result;
    }
}

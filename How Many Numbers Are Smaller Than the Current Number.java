
// Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
 
// Return the answer in an array.


Example 1:

Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]




class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            int count =0;
            for(int j =0;j<nums.length;j++){
                if(nums[j]<nums[i] && j != i){
                    count ++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}

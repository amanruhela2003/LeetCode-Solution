// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
class Solution {
    public int missingNumber(int[] nums) {
        int[] chosen = new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            chosen[nums[i]] = 1;
        }
        for (int i = 0; i < chosen.length; i++) {
            if (chosen[i] == 0) return i;
        }
        return -1;
    }
}

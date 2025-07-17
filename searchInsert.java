class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i]) {
                return i;
            }
        }
        return nums.length; 
    }
}
// This code finds the index at which a target value should be inserted into a sorted array.
// If the target is less than or equal to the current element, it returns the index.
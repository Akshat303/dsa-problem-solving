class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Step 1: Array ko sort karein
        Arrays.sort(nums);
        // Step 2: Adjacent elements ko compare karein
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true; // Duplicate mil gaya!
            }
        }
        
        return false; // Koi duplicate nahi mila

    }
}
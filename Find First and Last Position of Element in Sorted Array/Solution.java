class Solution {
    public int[] searchRange(int[] nums, int target) {

        int first = -1, last = -1;

        int low = 0, high = nums.length - 1;

        //  First
        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                first = mid;
                high = mid - 1;
            }
            else if (nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        // second num
        low = 0;
        high = nums.length - 1;

        // Find Last
        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                last = mid;
                low = mid + 1;
            }
            else if (nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return new int[]{first, last};
    }
}
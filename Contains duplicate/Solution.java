class Solution {
    public boolean containsDuplicate(int[] nums) {

        int[] hash = new int[1001];

        for(int i = 0; i < nums.length; i++) {

            hash[nums[i]]++;   // increase count

            if(hash[nums[i]] > 1) {
                return true;   // duplicate found
            }
        }

        return false; // no duplicate

    }
}
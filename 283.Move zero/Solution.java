class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

//while(nums[j] == 0) we can give condition like this but > 3 == 0 (fails) ends there

        while(j < nums.length) {
            nums[j] = 0;
            j++;
        }
    }}
class Solution {
    public int search(int[] nums, int target) {
        if(nums == null) return -1; 
        if(nums.length == 1 && nums[0] != target) return -1;
        int a = helper(nums, target);
        if(a == -1) return -1; 
        if(nums[a] != target) return -1; 
        return a;
    } 

    private int helper(int[] nums, int target){ 
        if(nums == null) return -1; 
        if(nums.length == 1 && nums[0] != target) return -1;
        if(nums[nums.length/2] == target) return nums.length/2; 
        if(nums[nums.length/2] < target) return helper(Arrays.copyOfRange(nums, nums.length / 2, nums.length), target) + nums.length/2; 
        return helper(Arrays.copyOfRange(nums, 0, nums.length / 2), target); 
    }
}

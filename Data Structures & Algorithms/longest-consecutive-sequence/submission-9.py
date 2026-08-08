class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if not nums: 
            return 0 
        if len(nums) == 1: 
            return 1
        nums.sort() 
        m = 0 
        count = 1
        for i in range(len(nums) - 1): 
            if nums[i+1] == nums[i]+1: 
                count += 1 
            elif nums[i+1] == nums[i]: 
                continue
            else: 
                count = 1
            m = max(m, count) 
        return max(m, count)
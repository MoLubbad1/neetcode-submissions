class Solution:
    def search(self, nums: List[int], target: int) -> int:
        if len(nums) == 0 or (len(nums) == 1 and nums[0] != target): 
            return -1 
        if nums[int(len(nums) / 2)] == target: 
            return int(len(nums) / 2)
        elif nums[int(len(nums) / 2)] < target: 
            a = int(len(nums) / 2) + self.search(nums[int(len(nums)/2):len(nums)], target) 
        else: 
            a = self.search(nums[0:int(len(nums)/2)], target) 
        if nums[a] == target: 
            return a 
        return -1
        
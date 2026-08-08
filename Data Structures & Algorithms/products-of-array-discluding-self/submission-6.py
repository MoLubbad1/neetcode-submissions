class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        ret = [] 
        pre = 1
        for i in range(len(nums)): 
            ret.append(pre) 
            pre *= nums[i] 
        
        post = 1 
        for j in range(len(nums) - 1, -1, -1): 
            ret[j] *= post 
            post *= nums[j] 
        
        return ret
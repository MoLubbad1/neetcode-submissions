class Solution:
    def climbStairs(self, n: int) -> int: 
        if n == 1 or n == 2: 
            return n 
        ret = [1, 2] 
        for i in range(2, n): 
            ret.append(ret[i-1]+ret[i-2]) 
        return ret[-1]
        
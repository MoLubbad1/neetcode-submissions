class Solution:
    def trap(self, height: List[int]) -> int:
        mleft = [] 
        mright = [0] * len(height) 
        m = 0 

        for n in height: 
            m = max(n,m) 
            mleft.append(m) 
        
        m = 0 
        for i in range(len(height)-1, -1, -1): 
            m = max(height[i], m) 
            mright[i] = m 
        
        ret = 0 
        for i in range(len(height)): 
            ret += max(0, min(mleft[i], mright[i]) - height[i]) 

        return ret
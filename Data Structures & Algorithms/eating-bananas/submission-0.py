class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        l, r = 1, max(piles) 
        ret = r
        while l <= r: 
            m = (l+r) // 2 
            a = h
            for n in piles: 
                a -= math.ceil(n/m) 
            if a < 0: 
                l = m + 1 
            else: 
                ret = min(ret, m)
                r = m - 1 
        return ret
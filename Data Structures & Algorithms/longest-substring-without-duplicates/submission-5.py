class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        se = set() 
        queue = deque() 
        m = 0
        for c in s: 
            while c in se:
                se.remove(queue.popleft()) 
            queue.append(c) 
            se.add(c) 
            m = max(m, len(queue)) 
        return m



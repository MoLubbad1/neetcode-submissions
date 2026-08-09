class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if not len(s) == len(t): 
            return False
        a = [0] * 26
        for i in range(len(s)): 
            a[ord(s[i]) - ord("a")] += 1
            a[ord(t[i]) - ord("a")] -= 1 
        for n in a: 
            if not n == 0: 
                return False 
        return True
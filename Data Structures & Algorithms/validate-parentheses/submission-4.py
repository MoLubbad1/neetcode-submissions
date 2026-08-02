class Solution:
    def isValid(self, s: str) -> bool: 
        stack = [] 
        map = {')' : '(', '}' : '{', ']' : '['} 
        for c in list(s): 
            if c in map: 
                if len(stack) > 0 and stack[-1] == map[c]:
                    stack.pop()
                else: 
                    return False 
            else: 
                stack.append(c) 
        return len(stack) == 0
        
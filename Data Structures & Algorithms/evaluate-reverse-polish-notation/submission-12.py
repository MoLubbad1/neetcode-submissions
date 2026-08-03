import operator
class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        stack = [] 
        map = {"+": operator.add, "-" : operator.sub, "*": operator.mul, "/": operator.truediv} 
        for i, str in enumerate(tokens): 
            if str in map: 
                if len(stack) < 2: 
                    return None 
                a = stack.pop()
                stack.append(int(map[str](int(stack.pop()), a))) 
            else: 
                stack.append(int(str)) 
        return stack.pop()
class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        stack = [] 
        ret = [0] * len(temperatures) 

        for i in range(len(temperatures)): 
            while stack and (temperatures[stack[-1]] < temperatures[i]): 
                a = stack.pop() 
                ret[a] = i - a 
            stack.append(i) 
        return ret
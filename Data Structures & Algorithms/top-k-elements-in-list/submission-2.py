class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        map = defaultdict(int) 
        arr = [[] for i in range(len(nums) + 1)] 
        
        for n in nums: 
            map[n] += 1 
            
        for key, value in map.items(): 
            arr[value].append(key) 

        i = len(arr) - 1
        ret = []
        while k > 0: 
            if arr[i]: 
                j = len(arr[i]) - 1
                while j >= 0: 
                    if k > 0: 
                        ret.append(arr[i][j]) 
                        j -= 1
                        k -= 1
                    else: 
                        return ret 
            i -= 1
        return ret
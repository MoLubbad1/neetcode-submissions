class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        u, d = 0, len(matrix)-1 
        while u <= d: 
            r = (u+d)//2
            if matrix[r][0] <= target <= matrix[r][-1]: 
                break 
            elif matrix[r][0] > target: 
                d = r -1
            else: 
                u = r + 1
        l, ri = 0, len(matrix[r])-1 
        while l <= ri: 
            x = (ri+l)//2 
            if matrix[r][x] > target: 
                ri = x -1
            elif matrix[r][x] < target: 
                l = x +1
            else: 
                return True 
        return False
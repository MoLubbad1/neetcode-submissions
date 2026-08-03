class MinStack:

    def __init__(self):
        self.list = [] 

    def push(self, val: int) -> None:
        self.list.append(val)

    def pop(self) -> None:
        del self.list[-1]

    def top(self) -> int:
        return self.list[-1]

    def getMin(self) -> int:   
        return min(self.list)

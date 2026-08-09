class Solution:

    def encode(self, strs: List[str]) -> str:
        if not strs: 
            return ""
        return "∫" + "∫".join(strs)
    def decode(self, s: str) -> List[str]:
        if s == "": 
            return []
        st = ""
        ret = [] 
        for c in s[1:]: 
            if c == '∫': 
                ret.append(st) 
                st = ""
            else: 
                st += c 
        ret.append(st)
        return ret
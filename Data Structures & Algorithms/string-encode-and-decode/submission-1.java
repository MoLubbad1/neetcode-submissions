class Solution {

    public String encode(List<String> strs) {
        StringBuilder ret = new StringBuilder();
        for(String x : strs){ 
            ret.append(x); 
            ret.append('€');
        } 
        return ret.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> ret = new ArrayList<>(); 
        StringBuilder a = new StringBuilder(); 
        for(char x : str.toCharArray()){ 
            if(x == '€'){ 
                String b = a.toString();
                ret.add(b); 
                a.setLength(0); 
                continue;
            } 
            a.append(x);
        } 
        return ret;
    }
}

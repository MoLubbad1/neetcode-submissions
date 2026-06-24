class Solution {
    public boolean isAnagram(String s, String t) { 
        HashMap<Character, Integer> track = new HashMap<>(); 
        if(s.length() != t.length()) return false; 
        for(int i = 0; i < s.length(); i++){ 
            track.merge(s.charAt(i), 1, Integer::sum);
        } 
        for(int i = 0; i < t.length(); i++){ 
            if(!track.containsKey(t.charAt(i))) return false; 
            if(track.get(t.charAt(i)) == 0) return false;
            track.computeIfPresent(t.charAt(i), (k, v) -> v - 1);
        } 
        return track.values().stream().noneMatch(v -> v < 0 || v > 0);
    }
}

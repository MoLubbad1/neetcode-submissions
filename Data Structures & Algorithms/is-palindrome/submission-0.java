class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();  
        StringBuilder sb1 = new StringBuilder();
        String x = s.toLowerCase();
        for(int i = 0; i < s.length(); i++){ 
            if(Character.isLetterOrDigit(x.charAt(i))){ 
                sb.append(x.charAt(i)); 
                sb1.append(x.charAt(i));
            }
        }   
        sb1.reverse();
        if(sb.compareTo(sb1) == 0) return true; 
        return false;
    }
}

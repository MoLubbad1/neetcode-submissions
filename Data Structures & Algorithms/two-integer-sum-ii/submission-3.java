class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); 
        int[] ret = new int[2];
        for(int i = 0; i < numbers.length; i++){ 
            if(map.containsKey(target - numbers[i])) continue;  
            if(map.containsKey(numbers[i])){ 
                ret[0] = map.get(numbers[i]); 
                ret[1] = i+1; 
                break;
            } 
            map.put(target-numbers[i], i+1);
        } 
        return ret;
    }
}

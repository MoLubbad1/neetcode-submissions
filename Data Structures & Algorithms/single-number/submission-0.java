class Solution {
    public int singleNumber(int[] nums) {
        ArrayList<Integer> map = new ArrayList<>(); 
        for(int i = 0; i < nums.length; i++){ 
            if(map.contains((Integer)nums[i])){ 
                map.remove((Integer)nums[i]); 
                continue;
            } 
            map.add((Integer)nums[i]);
        } 
        return map.get(0);
    }
}

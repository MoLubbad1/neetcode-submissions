class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(); 
        int max = 1;
        for(int i = 0; i < nums.length; i++){ 
            if(pq.contains(nums[i])) continue; 
            pq.add(nums[i]); 
        } 
        int track = 1; 
        int x = pq.poll(); 
        while(pq.peek() != null){   
            if(pq.peek() == x+1){ 
                track++; 
                if(track > max) max = track;
            } else{ 
                track = 1;
            }
            x = pq.poll();
        } 
        return max;
    }
}

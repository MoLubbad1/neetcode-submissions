class Solution {
    public int lastStoneWeight(int[] stones) { 
        if(stones.length == 0) return 0; 
        if(stones.length == 1) return stones[0]; 
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < stones.length; i++){ 
            pq.add(stones[i]);
        } 
        while(pq.size() > 1){ 
            int x = pq.poll(); 
            x -= pq.poll();
            if(x == 0) continue; 
            pq.add(x);
        } 
        if(pq.isEmpty()) return 0;
        return pq.poll();
    }
}

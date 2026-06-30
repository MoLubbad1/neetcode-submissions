class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < board.length; i++){
            HashMap<Character,Integer> mapc = new HashMap<>(); 
            HashMap<Character,Integer> mapr = new HashMap<>();
            for(int j = 0; j < board[0].length; j++){ 
                if(mapc.containsKey(board[i][j])) return false; 
                if(board[i][j] != '.') mapc.put(board[i][j], j); 
                if(mapr.containsKey(board[j][i])) return false; 
                if(board[j][i] != '.') mapr.put(board[j][i], j);

                if(i%3==0 && j%3==0){  
                    HashMap<Character,Integer> map3 = new HashMap<>();
                    for(int x = 0; x < 3; x++){ 
                        for(int z = 0; z < 3; z++){ 
                            if(map3.containsKey(board[x+i][z+j])) return false; 
                            if(board[x+i][z+j] != '.') map3.put(board[x+i][z+j], z+j); 
                        }
                    }
                }
            }
        } 
        return true;
    }
}

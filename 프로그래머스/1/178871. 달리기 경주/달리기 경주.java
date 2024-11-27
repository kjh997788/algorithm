import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        HashMap<String, Integer> ranking = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            ranking.put(players[i], i);
        }
        
        for (String calling : callings) {
            int rank = ranking.get(calling);
            
            String tmpStr = players[rank - 1];
            players[rank - 1] = calling;
            players[rank] = tmpStr;
                
            ranking.put(calling, rank - 1);
            ranking.put(tmpStr, rank);
        }
        
        return players;
    }
}
import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
         // 1. HashMap 생성 (Participant)
        HashMap<String, Integer> map = new HashMap<>();
        for(String player : participant)
            map.put(player, map.getOrDefault(player, 0) + 1);

        // 2. HashMap 제거 (Completion)
        for (String player : completion)
            map.put(player, map.get(player) - 1);

        // 3. value가 0이 아닌 마지막 주자 찾기
        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                answer  = key;
                break;
            }
        }
        
        return answer;
    }
}
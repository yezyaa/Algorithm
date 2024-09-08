import java.util.HashMap;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> hashMap = new HashMap<>(); // 각 문자의 인덱스 저장할 hashmap

        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i)))
                answer[i] = i - hashMap.get(s.charAt(i));
            else answer[i] = -1;

            hashMap.put(s.charAt(i), i);
        }

        return answer;
    }
}
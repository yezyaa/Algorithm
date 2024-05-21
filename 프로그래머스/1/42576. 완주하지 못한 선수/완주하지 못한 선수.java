import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        // 1. 두 배열을 정렬한다.
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        // 2. 두 배열이 다를 때까지 찾는다.
        int i = 0; // 마지막 주자가 완주하지 못했을 경우를 위해 변수를 따로 작성했다.
        for (; i < completion.length; i++) {
            if(!participant[i].equals(completion[i]))
                break;
        }
        
        // 3. 결과 확인      
        return participant[i];
    }
}
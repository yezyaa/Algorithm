import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer = "";

        // 1. 문자열을 문자열 배열로 변환
        String[] strArray = s.split("");

        // 2. 문자열 배열을 내림차순으로 정렬
        Arrays.sort(strArray, Collections.reverseOrder());

        // 3. 문자열 배열을 결합하여 문자열로 변환
        answer = String.join("", strArray);

        return answer;
    }
}
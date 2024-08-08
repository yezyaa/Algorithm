import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        // 1. 숫자를 문자열로 반환
        String str = Long.toString(n);

        // 2. 문자열을 문자열 배열로 반환
        String[] strArray = str.split("");

        // 3. 문자열 배열을 내림차순으로 정렬
        Arrays.sort(strArray, Collections.reverseOrder());

        // 4. 문자열 배열을 결합하여 문자열로 변환
        String sortedStr = String.join("", strArray);

        // 5. 문자열을 숫자로 변환
        return Long.parseLong(sortedStr);
    }
}
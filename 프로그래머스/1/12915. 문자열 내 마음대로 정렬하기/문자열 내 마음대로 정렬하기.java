import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String[] solution(String[] strings, int n) {
        // 문자열 배열을 정렬하는 과정에서 각 문자열의 n번째 문자를 기준으로 정렬
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // n번째 문자를 기준으로 비교
                if (s1.charAt(n) == s2.charAt(n)) {
                    // n번째 문자가 같으면 사전순으로 정렬
                    return s1.compareTo(s2);
                } else {
                    // n번째 문자를 기준으로 정렬
                    return Character.compare(s1.charAt(n), s2.charAt(n));
                }
            }
        });

        return strings;
    }
}
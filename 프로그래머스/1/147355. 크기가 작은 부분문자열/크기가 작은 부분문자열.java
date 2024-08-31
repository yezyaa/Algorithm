class Solution {
    public int solution(String t, String p) {
        int answer = 0; // t의 길이에서 p와 비교할 수 있는 숫자가 몇 번 나올 수 있는지

        // t의 길이 - p의 길이 만큼 순회
        for (int i = 0; i <= t.length() - p.length(); i++) {
            String num = t.substring(i, i + p.length()); // t의 i번째부터 i + p길이 만큼 문자열 자른 길이만큼 정수를 추출한 후 p의 정수와 비교
            if (Long.parseLong(num) <= Long.parseLong(p))
                answer++;
        }

        return answer;
    }
}
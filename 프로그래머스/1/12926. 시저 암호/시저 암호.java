class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for (char ch : s.toCharArray()) {
            // 대문자 처리
            if (ch >= 'A' && ch <= 'Z')
                answer.append((char) ((ch - 'A' + n) % 26 + 'A'));
            // 소문자 처리
            else if (ch >= 'a' && ch <= 'z')
                answer.append((char) ((ch - 'a' + n) % 26 + 'a'));
            // 공백이나 다른 문자들은 그대로 추가
            else
                answer.append(ch);
        }

        return answer.toString();
    }
}
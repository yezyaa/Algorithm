class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int index = 0; // 단어 내의 인덱스 추적

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                answer.append(c);
                index = 0; // 공백이 나올 경우, 초기화
            } else {
                if (index % 2 == 0)
                    answer.append(Character.toUpperCase(c));
                else answer.append(Character.toLowerCase(c));
                index++;
            }
        }

        return answer.toString();
    }
}
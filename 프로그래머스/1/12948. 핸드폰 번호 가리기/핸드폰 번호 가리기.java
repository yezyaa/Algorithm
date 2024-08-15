class Solution {
    public String solution(String phone_number) {
        String answer = "";

        int len = phone_number.length();

        // 마지막 4자리를 제외한 앞부분을 *로 변환
        for (int i = 0; i < len - 4; i++) {
            answer += "*";
        }

        // 마지막 4자리 유지
        answer += phone_number.substring(len - 4, len);

        return answer;
    }
}
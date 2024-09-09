class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0; // 총 얻은 병의 개수

        while (n >= a) {
            int exchange = (n / a) * b; // 교환한 병의 개수
            answer += exchange;
            n = (n % a) + exchange;
        }

        return answer;
    }
}
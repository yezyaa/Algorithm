class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int sum = 0;
        int len = number.length;

        for (int i = 0; i < len - 2; i++) {
            for (int j = i + 1; j < len - 1; j++) {
                for (int k = j + 1; k < len; k++) {
                    sum = number[i] + number[j] + number[k];
                    if (sum == 0)
                        answer++;
                }
            }
        }

        return answer;
    }
}
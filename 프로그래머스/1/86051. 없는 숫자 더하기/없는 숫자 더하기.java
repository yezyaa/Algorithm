class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int sum = 0;

        for (int i = 0; i <= 9; i++) {
            sum += i;
        }

        for (int number : numbers) {
            answer += number;
        }

        return sum - answer;
    }
}
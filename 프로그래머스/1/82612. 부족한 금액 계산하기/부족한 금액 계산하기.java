class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;

        for (int i = 1; i <= count; i++) {
            answer += (long) price * i;
        }
        System.out.println(answer);

        if (answer > money) {
            return answer - money;
        } else return answer = 0;
    }
}
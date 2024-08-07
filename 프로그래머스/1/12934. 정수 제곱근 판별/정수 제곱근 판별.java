class Solution {
    public long solution(long n) {
        long answer = 0;
        int num = (int) Math.sqrt(n);

        if (n == (long) num * num)
            answer = (long) (num + 1) * (num + 1);
        else return -1;

        return answer;
    }
}
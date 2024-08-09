class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int num = x;
        int sum = 0;

        while (x > 0) {
            sum += (x % 10);
            x /= 10;
        }

        if (num % sum != 0)
            return false;
        else
            return answer;
    }
}
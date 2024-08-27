import java.util.Arrays;

class Solution {
    public int[] solution(int n, int m) {
        int min = 0;
        int max = 0;
        int num1 = 0; // 최대 공약수
        int num2 = 0; // 최소 공배수

        if (n > m) {
            max = n;
            min = m;
        } else {
            max = m;
            min = n;
        }

        // 최대 공약수
        for (int i = 1; i <= min; i++) {
            if (min % i == 0 && max % i == 0)
                num1 = i;
        }

        // 최소 공배수
        num2 = (n * m) / num1;

        return new int[] {num1, num2};
    }
}
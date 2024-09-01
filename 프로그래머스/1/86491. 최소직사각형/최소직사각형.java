class Solution {
    public int solution(int[][] sizes) {
        int x = 0; // 가로와 세로 중 큰 값을 가로 길이로 설정
        int y = 0; // 가로와 세로 중 작은 값을 세로 길이로 설정

        // 세로의 길이가 가로의 길이 보다 클 경우 가로 세로 길이 교체
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }

            if (x < sizes[i][0])
                x = sizes[i][0];

            if (y < sizes[i][1])
                y = sizes[i][1];
        }

        return x * y;
    }
}
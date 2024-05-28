import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {       
        int max_w = 0; // 가로 길이
        int max_h = 0; // 세로 길이
        
        for (int i = 0; i < sizes.length; i++) {
            // 가로 길이가 세로 길이보다 작으면 위치를 바꿔준다.
            if (sizes[i][0] < sizes[i][1]) {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
            
            // 최대 가로 길이와 최대 세로 길이를 갱신한다.
            if (max_w < sizes[i][0])
                max_w = sizes[i][0];
            if (max_h < sizes[i][1])
                max_h = sizes[i][1];
        }
        return max_w * max_h;
    }
}
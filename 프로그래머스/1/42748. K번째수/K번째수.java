import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        // commands 길이 만큼의 결과 배열 생성
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int k = commands[i][2];
            
            int[] subArray = Arrays.copyOfRange(array, start - 1, end);
            
            Arrays.sort(subArray); // 오름차순 정렬
            
            answer[i] = subArray[k - 1];
        }
        return answer;
    }
}
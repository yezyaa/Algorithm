import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        // 학생별 답안 패턴
        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        // 맞춘 개수
        int[] scores = {0, 0, 0};

        for (int i = 0; i < answers.length; i++) {
            if (student1[i % student1.length] == answers[i])
                scores[0]++;
            if (student2[i % student2.length] == answers[i])
                scores[1]++;
            if (student3[i % student3.length] == answers[i])
                scores[2]++;
        }

        // 가장 많이 맞춘 개수 찾기
        int maxScore = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
            }
        }

        // 가장 많이 맞춘 학생 찾기
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore)
                answer.add(i + 1);
        }

        // 리스트를 배열로 변환하여 반환
        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        return result;
    }
}
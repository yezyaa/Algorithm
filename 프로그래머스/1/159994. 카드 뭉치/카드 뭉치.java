import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        // 큐에 카드 뭉치 넣기
        Queue<String> queue1 = new LinkedList<>();
        Queue<String> queue2 = new LinkedList<>();

        // 카드 뭉치를 큐로 변환
        for (String card : cards1) {
            queue1.add(card);
        }

        for (String card : cards2) {
            queue2.add(card);
        }

        // goal 배열의 단어와 비교
        for (String word : goal) {
            if (!queue1.isEmpty() && queue1.peek().equals(word))
                queue1.poll();
            else if (!queue2.isEmpty() && queue2.peek().equals(word))
                queue2.poll();
            else return "No"; // 목표 단어를 카드 뭉치에서 순서대로 만들 수 없는 경우
        }

        return "Yes"; // 목표 단어를 모두 만들 수 있는 경우
    }
}
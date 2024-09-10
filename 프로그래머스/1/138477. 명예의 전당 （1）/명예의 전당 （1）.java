import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 작은 값이 우선순위가 높은 큐

        for (int i = 0; i < score.length; i++) {
            pq.offer(score[i]); // 새로운 점수를 큐에 추가
            if (pq.size() > k) {
                pq.poll(); // 큐의 크기가 k를 넘으면 가장 작은 값을 제거
            }
            answer[i] = pq.peek(); // 큐에서 가장 작은 값을 저장
        }

        return answer;
    }
}
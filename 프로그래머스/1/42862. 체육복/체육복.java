import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        // 배열 정렬
        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 옷을 도난 당하지 않은 학생 수
        answer = n - lost.length;

        // 여벌 옷을 가진 학생이 도난당한 경우
        for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == reserve[j]) {
					answer++;
					lost[i] = -1;
					reserve[j] = -1;
                    break;
				}
			}
		}

        // 옷을 도난 당한 학생 중, 체육복을 빌릴 수 있는 학생
        for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]) {
					answer++;
					reserve[j] = -1;
					break;
				}
			}
		}
        
        return answer;
    }
}
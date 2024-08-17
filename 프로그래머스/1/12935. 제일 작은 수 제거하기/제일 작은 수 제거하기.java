import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int minValue = arr[0];

        // 배열의 길이가 1인 경우에는 -1 리턴
        if (arr.length == 1) {
            return new int[]{-1};
        }

        // 배열의 최소 값 구하기
        for (int i : arr) {
            if (i < minValue) {
                minValue = i;
            }
        }

        // 원본 배열에서 최소 값 뺀 배열 생성
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == minValue)
                continue;
            arrayList.add(arr[i]);
        }

        // ArrayList를 int[] 배열로 변환
        int[] answer = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }

        return answer;
    }
}
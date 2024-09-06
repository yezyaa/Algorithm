import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];

                if (!arrayList.contains(sum))
                    arrayList.add(sum);
            }
        }

        int[] answer = new int[arrayList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrayList.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }
}
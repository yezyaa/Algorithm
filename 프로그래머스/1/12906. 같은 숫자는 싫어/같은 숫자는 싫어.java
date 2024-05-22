import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        // 스택 생성
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(arr[0]);
        
        for (int i = 1; i < arr.length; i++) {
            if (stack.peek() == arr[i])
                continue;
            else
                stack.push(arr[i]);
        }
        
        // pop되는 순서 바꾸기
        answer = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--)
            answer[i] = stack.pop();

        return answer;
    }
}
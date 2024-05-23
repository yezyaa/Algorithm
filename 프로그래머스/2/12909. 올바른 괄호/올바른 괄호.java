import java.util.Stack;
import java.lang.String;

class Solution {
    boolean solution(String s) {
        
        // 문자열의 길이가 홀수일 경우 false 반환
        if (s.length() % 2 == 1)
            return false;
        
        // 스택 생성
        Stack<Character> stack = new Stack<Character>();
        
        // 여는 괄호 확인 후 push
        for(char c : s.toCharArray()) {
            if (c == '(') // 여는 괄호일 때 push
                stack.push(c);
            else {
                if (stack.isEmpty()) // push된 괄호가 없을 때
                    return false;    
                
                // pop해서 짝이 맞는지 확인
                char top = stack.pop();
                if (top == '(' && c != ')')
                    return false;    
            }
        }
        // 최종적으로 스택이 비어있으면 괄호 검사 성공
        return stack.isEmpty();
    }
}
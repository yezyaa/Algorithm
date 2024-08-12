class Solution {
    public String solution(String[] seoul) {
        String answer = "Kim";
        int count = 0;

        for (String s : seoul) {
            if (s.equals(answer)) {
                break;
            }
            count++;
        }

        return "김서방은 " + count + "에 있다";
    }
}
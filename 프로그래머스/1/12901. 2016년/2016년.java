class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] day = new String[]{"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] month = new int[12];

        // 각 월이 며칠까지 있는지 확인 후 2016년이 총 며칠인지 확인
        for (int i = 0; i <= month.length; i++) {
            switch (i + 1) {
                case 1, 3, 5, 7, 8, 10, 12:
                    month[i] = 31; break;
                case 2:
                    month[i] = 29; break;
                case 4, 6, 9, 11:
                    month[i] = 30; break;
            }
        }

        // 총 일수 계산
        int totalDays = 0;
        for (int i = 0; i < a - 1; i++) {
            totalDays += month[i];
        }
        totalDays += b - 1;

        // 요일 계산
        answer = day[totalDays % 7];

        return answer;
    }
}
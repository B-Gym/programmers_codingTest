class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        int[][] before_temp = new int[26][2];
        int[][] after_temp = new int[26][2];

        // 26열 2행의 2차원 배열에 소문자 a~z 까지의 아스키코드값 부여
        int asciiNum = 97;
        for (int i = 0; i < before_temp.length; i++) {
            before_temp[i][0] = after_temp[i][0] = asciiNum++;
        }

        // 각 아스키코드에 해당하는 값이 before문자열에 존재하는 경우 카운트
        for (int i = 0; i < before.length(); i++) {
            before_temp[(int) before.charAt(i) - 97][1]++;
        }

        // 각 아스키코드에 해당하는 값이 aftet문자열에 존재하는 경우 카운트
        for (int i = 0; i < after.length(); i++) {
            after_temp[(int) after.charAt(i) - 97][1]++;
        }

        // before_temp와 after_temp내에 존재하는 알파벳의 갯수를 비교하여 모자르면 만들 수 없으므로 0을 반환
        for (int i = 0; i < before_temp.length; i++) {
            if (before_temp[i][1] < after_temp[i][1]) {
                return 0;
            }
        }

        return answer = 1;
    }
}
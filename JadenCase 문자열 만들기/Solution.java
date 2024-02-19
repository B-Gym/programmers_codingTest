class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        char[] temp = s.toCharArray();

        int count = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != ' ') {
                count++;
                if (count == 1 && 'a' <= temp[i] && temp[i] <= 'z') {
                    answer += ("" + temp[i]).toUpperCase();
                } else {
                    answer += temp[i];
                }
            } else {
                count = 0;
                answer += temp[i];
            }
        }

        return answer;
    }
}
class Solution {
    public int solution(String my_string) {
        int answer;

        String[] num = my_string.split("\\D+");

        answer = Integer.parseInt(num[0]);

        my_string = my_string.replaceAll("[0-9]", "").replaceAll(" ", "");
        String[] sign = my_string.split("");

        for (int i = 0; i < sign.length; i++) {
            if (sign[i].equals("+")) {
                answer += Integer.parseInt(num[i + 1]);
            } else {
                answer -= Integer.parseInt(num[i + 1]);
            }
        }

        return answer;
    }
}
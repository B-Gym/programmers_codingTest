class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[my_str.length() % n == 0 ? my_str.length() / n : my_str.length() / n + 1];

        int start = 0;
        int end = n;

        for (int i = 0; i < answer.length; i++) {
            answer[i] = end <= my_str.length() ? my_str.substring(start, end)
                    : my_str.substring(start, my_str.length());
            start += n;
            end += n;
        }
        return answer;
    }
}
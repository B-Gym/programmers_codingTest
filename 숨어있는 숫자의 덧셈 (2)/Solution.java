class Solution {
    public int solution(String my_string) {
        int answer = 0;

        String regExp = "\\D+";
        String[] arr = my_string.split(regExp);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("")) {
                arr[i] = "0";
            }
            answer += Integer.parseInt(arr[i]);
        }

        return answer;
    }
}
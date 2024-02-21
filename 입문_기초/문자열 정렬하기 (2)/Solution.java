import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        int[] arr = new int[my_string.length()];

        my_string = my_string.toLowerCase();

        for (int i = 0; i < my_string.length(); i++) {
            arr[i] = my_string.charAt(i);
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            answer += (char) arr[i];
        }

        return answer;
    }
}
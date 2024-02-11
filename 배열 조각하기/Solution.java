import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int[] query) {

        ArrayList<Integer> answer = new ArrayList<>();

        for (int num : arr) {
            answer.add(num);
        }

        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                while (answer.size() != query[i] + 1) {
                    int endIdx = answer.size() - 1;
                    answer.remove(endIdx--);
                    // System.out.println("짝: " + answer);
                }
            } else {
                for (int p = query[i] - 1; p >= 0; p--) {
                    // System.out.println("홀: " + answer);
                    answer.remove(p);
                }
            }
        }
        return answer;
    }
}
import java.util.*;

public class Solution {
    public static ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        int prev = arr[0];
        int end = arr[arr.length - 1];

        for (int head = 1; head < arr.length; head++) {
            if (prev != arr[head]) {
                answer.add(prev);
            }
            prev = arr[head];
        }

        answer.add(end);

        return answer;
    }
}
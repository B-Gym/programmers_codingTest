package Sort.K번째수;

import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        int idx = 0;
        for (int i = 0; i < commands.length; i++) {
            int[] temp = new int[commands[i][1] - commands[i][0] + 1];
            for (int j = commands[i][0] - 1; j <= commands[i][1] - 1; j++) {
                temp[idx] = array[j];
                idx++;
            }
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2] - 1];
            idx = 0;
        }
        return answer;
    }
}